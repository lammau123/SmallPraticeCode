package small.code.pratice.array;

/**
 * Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * Example 1:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * 
 * Example 2:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * 
 *  
 * 
 * Constraints:
 * 
 *     0 <= nums.length <= 10^5
 *     -10^9 <= nums[i] <= 10^9
 *     nums is a non decreasing array.
 *     -10^9 <= target <= 10^9
 *
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
    	if(nums.length <= 0) {
    		return new int[] {-1,-1};
    	}
        int r[] = searchMin(nums, target, 0, nums.length-1);
        if(r[0] != -1) {
        	return searchMax(nums, target, r[0], r[1]);
        }
        return new int[] {-1,-1};
    }
    
    private int[] searchMin(int[] nums, int target, int start, int end) {
    	int left = start, right = end;
    	int _end = end;
    	boolean flag = true;
    	while(left <= right) {
    		int mid = left + (right-left)/2;
    		if(target <= nums[mid]){
    			if(target == nums[mid] && flag) {
    				_end = right;
    				flag = false;
    			}
    			right = mid - 1;
    		} else {
    			left = mid + 1;
    		}
    	}
    	
    	return left <= end && nums[left] == target ? new int[] {left, _end} : new int[] {-1, -1};
    }
    
    private int[] searchMax(int[] nums, int target, int start, int end) {
    	int _start = start;
    	while(start <= end) {
    		int mid = start + (end-start)/2;
    		if(target < nums[mid]){
    			end = mid - 1;
    		} else {
    			start = mid + 1;
    		}
    	}
    	
    	return nums[end] == target ? new int[] {_start, end} : new int[]{-1, -1};
    }
}
