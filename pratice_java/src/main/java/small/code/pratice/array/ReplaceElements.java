package small.code.pratice.array;

/**
 * Replace Elements with Greatest Element on Right Side
 * 
 * Given an array arr, replace every element in that array with the greatest element among 
 * the elements to its right, and replace the last element with -1.
 * 
 * After doing so, return the array.
 * 
 * Example 1:
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 * 
 * Constraints:
 * 
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 * 
 *
 */
public class ReplaceElements {
	public int[] replaceElements(int[] arr) {
        for(int start = 0; start < arr.length-1; start++) {
        	int max = arr[start+1];
        	for(int start1 = start+2; start1 < arr.length; start1++) {
        		max = Math.max(arr[start1], max);
        	}
        	arr[start] = max;
        }
        arr[arr.length - 1] = -1;
        
        return arr;
    }
}
