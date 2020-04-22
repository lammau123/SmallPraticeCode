package small.code.pratice.array;

/**
 * 
 * Sort An Array By Parity
 * Given an array A of non-negative integers, return an array consisting of all the even 
 * elements of A, followed by all the odd elements of A.
 * 
 * You may return any answer array that satisfies this condition.
 * 
 * Example 1:
 * 
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * 
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * 
 * Note:
 * 
 * 1 <= A.length <= 5000
 * 
 * 0 <= A[i] <= 5000
 *
 */
public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {
        int start = 0, end = A.length - 1;
        while(start < end) {
        	if((A[start] & 1) == 1 && (A[end] & 1) == 0) {
        		int tmp = A[start];
        		A[start] = A[end];
        		A[end] = tmp;
        	}
        	if((A[start] & 1) == 0) {
        		start++;
        	}
        	if((A[end] & 1) == 1) {
        		end--;
        	}
        }
        return A;
    }
}
