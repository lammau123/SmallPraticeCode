package small.code.pratice.array;


/**
 * Third Maximum Number
 * 
 * Given a non-empty array of integers, return the third maximum number in this array. 
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 * Example 1:
 * 
 * Input: [3, 2, 1]
 * Output: 1
 * 
 * Explanation: The third maximum is 1.
 * 
 * Example 2:
 * Input: [1, 2]
 * Output: 2
 * 
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * 
 * Example 3:
 * 
 * Input: [2, 2, 3, 1]
 * 
 * Output: 1
 * 
 * Explanation: Note that the third maximum here means the third maximum distinct number
 * Both numbers with value 2 are both considered as second maximum.
 *
 */
public class ThirdMax {
	public int thirdMax(int[] nums) {
        int []third = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        int thirdIndex = -1;
		for (int start = 0; start < nums.length; start++) {
			if (nums[start] >= third[0]) {
				if(nums[start] == third[0] && thirdIndex < 0) {
					thirdIndex = 0;
				}
				if(nums[start] != third[0]) {
					thirdIndex = thirdIndex >= 2 ? thirdIndex : thirdIndex + 1;
					shiftRight(third, 0, thirdIndex);
					third[0] = nums[start];
				}
			} else if (nums[start] >= third[1]) {
				if(nums[start] == third[1] && thirdIndex < 1) {
					thirdIndex = 1;
				}
				if(nums[start] != third[1]) {
					thirdIndex = thirdIndex >= 2 ? thirdIndex : thirdIndex + 1;
					shiftRight(third, 1, thirdIndex);
					third[1] = nums[start];
				}
			} else if (nums[start] >= third[2]) {
				thirdIndex = 2;
				third[2] = nums[start];
			}

		}
        return third[thirdIndex == 2 ? 2 : 0];
    }
	private void shiftRight(int[] nums, int from, int to) {
		for(int end = to; end > from; end--) {
			nums[end] = nums[end-1];
		}
	}
}
