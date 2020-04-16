package small.code.pratice.array;

/**
 * Duplicate Zeros
 * 
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, 
 * shifting the remaining elements to the right.
 * 
 * Note that elements beyond the length of the original array are not written.
 * 
 * Do the above modifications to the input array in place, do not return anything from your function.
 * 
 * Example 1:
 * 
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * 
 * Example 2:
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 * 
 * Note:
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 *
 */
public class DuplicateZeros {
	private void shiftRight(int[] arr, int pos) {
		for(int end = arr.length - 1; end > pos ; end--) {
			arr[end] = arr[end - 1];
		}
	}
	public void duplicateZeros(int[] arr) {
		for(int start = 0; start < arr.length; start++) {
			if((start < arr.length - 1) && arr[start] == 0) {
				shiftRight(arr, start+1);
				arr[start+1] = 0;
				start++;
			}
		}
    }
}
