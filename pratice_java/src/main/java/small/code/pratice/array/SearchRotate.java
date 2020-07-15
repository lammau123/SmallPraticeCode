package small.code.pratice.array;

/**
 * Search in Rotated Sorted Array
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * 
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * 
 * You may assume no duplicate exists in the array.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * Example 1:
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * 
 * Example 2:
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 *
 */
public class SearchRotate {
	public int search(int[] nums, int target) {
        if(nums == null || nums.length <= 0) return -1;
        int start = 0, end = nums.length-1;
        while(start <= end) {
        	int mid = start + (end-start)/2;
        	if(nums[mid] == target) {
        		return mid;
        	}
        	if(nums[start] <= nums[mid]) {
        		if(target >= nums[start] && target < nums[mid]) {
        			end = mid - 1;
        		} else {
        			start = mid + 1;
        		}
        	} else {
        		if(target > nums[mid] && target <= nums[end]) {
        			start = mid + 1;
        		} else {
        			end = mid - 1;
        		}
        	}      	
        }
        return -1;
	}
	
	public boolean search1(int[] nums, int target) {
        if(nums == null || nums.length <= 0) return false;
        return search1(nums, 0, nums.length-1, target);
	}
	
	public boolean search1(int[] nums, int left, int right, int target) {
        while(left <= right) {
        	int mid = left + (right-left)/2;
        	if(nums[mid] == target) {
        		return true;
        	}
        	if(nums[left] < nums[mid]) {
        		if(target >= nums[left] && target < nums[mid]) {
        			right = mid - 1;
        		} else {
        			left = mid + 1;
        		}
        	} else if(nums[left] > nums[mid]){
        		if(target > nums[mid] && target <= nums[right]) {
        			left = mid + 1;
        		} else {
        			right = mid - 1;
        		}
        	} else {
        		return (search1(nums, left, mid-1, target) || search1(nums, mid+1, right, target));
        	}
        }
        return false;
	}
	
	public int search2(int[] nums) {
        int left = 0, right = nums.length-1;
        while(right - left > 1) {
        	int mid = left + (right-left)/2;
        	if(nums[mid] - mid != nums[left] - left) {
        		right = mid;
        	} else {
        		left = mid;
        	}
        }
        
        return nums[left] + 1;
	}
}
