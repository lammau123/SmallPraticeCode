package small.code.pratice.array;

/**
 *  Find Peak Element
 * A peak element is an element that is greater than its neighbors.
 * 
 * Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
 * 
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * 
 * You may imagine that nums[-1] = nums[n] = -∞.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 * 
 * Example 2:
 * 
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 1 or 5 
 * Explanation: Your function can return either index number 1 where the peak element is 2, 
 *              or index number 5 where the peak element is 6.
 * 
 * Follow up: Your solution should be in logarithmic complexity.
 *
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
    	return findPeakElement(nums, 0, nums.length-1);
    }
    
    private int findPeakElement(int[] nums, int start, int end) {
    	int mid = start + (end - start)/2;
    	if((mid <= 0 || nums[mid] > nums[mid-1]) && 
    			(mid >= nums.length-1 || nums[mid] > nums[mid+1])) {
    		return mid;
    	}
    	
    	if(mid > start) {
    		int leftPeek = findPeakElement(nums, start, mid-1);
	    	if(leftPeek >= 0) {
	    		return leftPeek;
	    	}
    	}
    	if(mid < end) {
    		int rightPeek = findPeakElement(nums, mid+1, end);
	    	if(rightPeek >= 0) {
	    		return rightPeek;
	    	}
    	}
    	return -1;
    }
}
