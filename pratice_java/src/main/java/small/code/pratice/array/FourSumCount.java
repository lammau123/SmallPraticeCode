package small.code.pratice.array;

import java.util.Arrays;

/**
 * 4Sum II
 * 
 * Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l) there are such that A[i] + B[j] + C[k] + D[l] is zero.
 * 
 * To make problem a bit easier, all A, B, C, D have same length of N 
 * where 0 ≤ N ≤ 500. All integers are in the range of -228 to 228 - 1 and the 
 * result is guaranteed to be at most 231 - 1.
 * 
 * Example:
 * 
 * Input:
 * A = [ 1, 2]
 * B = [-2,-1]
 * C = [-1, 2]
 * D = [ 0, 2]
 * 
 * Output:
 * 2
 * 
 * Explanation:
 * The two tuples are:
 * 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
 * 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
 *
 */
public class FourSumCount {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    	Arrays.sort(A);
    	Arrays.sort(B);
    	Arrays.sort(C);
    	Arrays.sort(D);
    	int count = 0;
        for(int a: A) {
        	for(int b: B) {
        		int ab = a+b;
        		for(int c: C) {
        			int abc = ab+c;
        			int first = 0, last = D.length-1;
        			while(first<=last) {
        				int mid = (last+first)/2;
        				if(D[mid]*(-1) == abc) {
        					count++;
        					int tmp = mid+1;
        					while(tmp <= last && D[tmp] == D[tmp-1]) {
        						count++;
        						tmp++;
        					}
        					tmp = mid-1;
        					while(tmp >= 0 && D[tmp] == D[tmp+1]) {
        						count++;
        						tmp--;
        					}
        					break;
        				} else if(D[mid] > abc*(-1)) {
        					last = mid - 1;
        				} else {
        					first = mid + 1;
        				}
        			}
        		}
        	}
        }
        
        return count;
    }
}
