package small.code.pratice.array;

/**
 * 
 * Search in Rotated Sorted Array
 * 
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you
 *  beforehand.
 *  (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *  
 *  You are given a target value to search. If found in the array return its index,
 *  otherwise return -1.
 *  You may assume no duplicate exists in the array.
 *  
 *  Your algorithm's runtime complexity must be in the order of O(log n).
 *  
 *  Example 1:
 *  
 *  Input: nums = [4,5,6,7,0,1,2], target = 0
 *  Output: 4
 *  
 *  Example 2:
 *  
 *  Input: nums = [4,5,6,7,0,1,2], target = 3
 *  Output: -1
 *
 */
public class RotatedSortedArray {
	public int search(int[] nums, int target) {
		if(nums == null || nums.length <= 0) return -1;
		if(target >= nums[0]) {
			for(int start = 0; start < nums.length; start++) {
				if(nums[start] == target) {
					return start;
				}
				if(start < nums.length - 1 && nums[start] > nums[start+1]) {
					return -1;
				}
			}
		} else if(target <= nums[nums.length-1]) {
			for(int end = nums.length-1; end >= 0; end--) {
				if(nums[end] == target) {
					return end;
				}
				if(end > 0 && nums[end] < nums[end-1]) {
					return -1;
				}
			}
		} 
		
		return -1;
    }
}
