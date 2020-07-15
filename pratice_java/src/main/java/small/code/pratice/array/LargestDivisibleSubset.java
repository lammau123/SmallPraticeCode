package small.code.pratice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Largest Divisible Subset
 * 
 * Given a set of distinct positive integers, find the largest subset such that
 * every pair (Si, Sj) of elements in this subset satisfies:
 * 
 * Si % Sj = 0 or Sj % Si = 0.
 * 
 * If there are multiple solutions, return any subset is fine.
 * 
 * Example 1:
 * 
 * Input: [1,2,3] Output: [1,2] (of course, [1,3] will also be ok)
 * 
 * Example 2:
 * 
 * Input: [1,2,4,8] Output: [1,2,4,8]
 *
 */
public class LargestDivisibleSubset {
	public List<Integer> largestDivisibleSubset(int[] nums) {
		List<Integer> rs = new ArrayList<>();
		if (nums.length > 0) {
			Arrays.sort(nums);
			int[] dp1 = new int[nums.length + 1];
			int[] dp2 = new int[nums.length + 1];
			int max = 0, maxIndex = 0;
			Arrays.fill(dp1, -1);
			Arrays.fill(dp2, 1);
			for (int i = 1; i < nums.length; i++) {
				for (int j = i - 1; j >= 0; j--) {
					if (nums[i] % nums[j] == 0) {
						if(dp2[i] < dp2[j] + 1) {
							dp2[i] = dp2[j] + 1;
							dp1[i] = j;
						}
						if (dp2[i] > max) {
							max = dp2[i];
							maxIndex = i;
						}
					}
				}
			}
			while (maxIndex >= 0) {
				rs.add(0, nums[maxIndex]);
				maxIndex = dp1[maxIndex];
			}
		}
		return rs;
	}
}
