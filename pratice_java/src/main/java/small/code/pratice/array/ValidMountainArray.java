package small.code.pratice.array;

/**
 * Valid Mountain Array
 * 
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 * 
 * Recall that A is a mountain array if and only if:
 * 
 * A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 * 
 * Example 1:
 * 
 * Input: [2,1]
 * Output: false
 * 
 * Example 2:
 * 
 * Input: [3,5,5]
 * Output: false
 * 
 * Example 3:
 * 
 * Input: [0,3,2,1]
 * Output: true
 * 
 * Note:
 * 
 * 0 <= A.length <= 10000
 * 0 <= A[i] <= 10000 
 *
 */
public class ValidMountainArray {
	private final int EQUAL = 0;
	private final int UP = 1;
	private final int DOWN = 2;
	public boolean validMountainArray(int[] A) {
		int direction = EQUAL;
		for(int start = 1; start < A.length; start++) {
			if(A[start - 1] < A[start]) {
				if(direction == DOWN) {
					return false;
				}
				direction = UP;
			} else if(A[start - 1] > A[start]) {
				if(direction == EQUAL) {
					return false;
				}
				direction = DOWN;
			} else {
				return false;
			}
		}
		return direction == DOWN && A.length > 0;
    }
}
