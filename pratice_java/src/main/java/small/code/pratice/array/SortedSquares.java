package small.code.pratice.array;

/**
 * Squares of a Sorted Array
 * 
 * Given an array of integers A sorted in non-decreasing order, return an
 *  array of the squares of each number, also in sorted non-decreasing order.
 *
 * Example 1:
 * 
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * 
 * Example 2:
 * 
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * 
 * Note:
 *  1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 *  A is sorted in non-decreasing order.
 *
 */
public class SortedSquares {
	private int[] mergeArray(int[] arr) {
		int[] rs = new int[arr.length];
        int start = 0, end = arr.length - 1; 
        for(int endRs = rs.length - 1; endRs >= 0; endRs--) {
        	if(start < arr.length && end >= 0) {
	        	if(arr[start] > arr[end]) {
	        		rs[endRs] = arr[start++];
		        } else {
		        	rs[endRs] = arr[end--];
		        }
        	} else if(start < arr.length) {
        		rs[endRs] = arr[start++];
        	} else {
        		rs[endRs] = arr[end--];
        	}
        }
        return rs;
	}
	public int[] sortedSquares(int[] A) {
		boolean merge = A[0] < 0 ? true : false;
        for(int start = 0; start < A.length; start++) {
        	A[start] *= A[start]; 
        }
        if(merge) {
	        return mergeArray(A);
        }
        return A;
    }
}
