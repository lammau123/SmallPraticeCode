package small.code.pratice.array;

/**
 * Find in Mountain Array
 * You may recall that an array A is a mountain array if and only if:
 * 
 *     A.length >= 3
 *     There exists some i with 0 < i < A.length - 1 such that:
 *         A[0] < A[1] < ... A[i-1] < A[i]
 *         A[i] > A[i+1] > ... > A[A.length - 1]
 * 
 * Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target.  If such an index doesn't exist, return -1.
 * 
 * You can't access the mountain array directly.  You may only access the array using a MountainArray interface:
 * 
 *     MountainArray.get(k) returns the element of the array at index k (0-indexed).
 *     MountainArray.length() returns the length of the array.
 * 
 * Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer.  Also, any solutions that attempt to circumvent the judge will result in disqualification.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: array = [1,2,3,4,5,3,1], target = 3
 * Output: 2
 * Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
 * 
 * Example 2:
 * 
 * Input: array = [0,1,2,4,2,1], target = 3
 * Output: -1
 * Explanation: 3 does not exist in the array, so we return -1.
 * 
 *  
 * 
 * Constraints:
 * 
 *     3 <= mountain_arr.length() <= 10000
 *     0 <= target <= 10^9
 *     0 <= mountain_arr.get(index) <= 10^9
 *
 */
public class FindInMountainArray {
	public int findInMountainArray(int target, MountainArray mountainArr) {
		return findInMountainArray(0, mountainArr.length()-1, target, mountainArr);
	}
	
    private int findInMountainArray(int left, int right, int target, MountainArray mountainArr) {
        int mid = left + (right-left)/2;
        int midValue = mountainArr.get(mid);
        int leftValue = mid-1 >= left? mountainArr.get(mid-1): midValue;
        if(midValue >= leftValue) {
        	if(midValue >= target) {
	        	int found = findInMountainArray(true, left, mid, target, mountainArr);
	        	if(found >= 0) {
	        		return found;
	        	}
        	}
        	if(mid+1 > right) {
        		return -1;
        	}
        	return findInMountainArray(mid+1, right, target, mountainArr);
        } 
        	
        int found = findInMountainArray(left, mid-1, target, mountainArr);
        if(found >= 0) {
        	return found;
        }
        return findInMountainArray(false, mid+1, right, target, mountainArr);
    }
    
    private int findInMountainArray(boolean order, int left, int right, int target, MountainArray mountainArr) {
    	while(left <= right) {
    		int mid = left + (right - left)/2;
    		int midValue = mountainArr.get(mid);
    		if(midValue == target) {
    			return mid;
    		}
    		if(midValue > target) {
    			if(order) {
    				right = mid-1;
    			} else {
    				left = mid+1;
    			}
    		} else {
    			if(order) {
    				left = mid+1;
    			} else {
    				right = mid-1;
    			}
    		}
    	}
    	return -1;
    }
}
