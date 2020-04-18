package small.code.pratice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Check If N and Its Double Exist
 * 
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 * 
 * More formally check if there exists two indices i and j such that :
 * 
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 * 
 * Example 1:
 * 
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 * 
 * Example 2:
 * 
 * Input: arr = [7,1,14,11]
 * Output: true
 * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
 * 
 * Example 3:
 * 
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 *
 * Constraints:
 * 
 * 2 <= arr.length <= 500
 * -10^3 <= arr[i] <= 10^3
 * 
 */
public class CheckIfExist {
	public boolean checkIfExist(int[] arr) {
		for(int start1 = 0; start1 < arr.length - 1; start1++) {
			int mul = arr[start1]*2, div = arr[start1]/2, mod = arr[start1]%2;
			for(int start2 = start1+1; start2 < arr.length; start2++) {
				if(arr[start2] == mul || (mod == 0 && arr[start2] == div)) {
					return true;
				}
			}
		}
		
		return false;
    }
}
