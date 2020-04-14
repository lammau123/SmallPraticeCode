package small.code.pratice.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Contiguous Array
 * 
 * Given a binary array, find the maximum length of a contiguous 
 * subarray with equal number of 0 and 1.
 * 
 * Example 1:
 * 
 * Input: [0,1]
 * Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
 * 
 * Example 2:
 * 
 * Input: [0,1,0]
 * Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 * 
 * Note: The length of the given binary array will not exceed 50,000. 
 *
 */
public class FindMaxLength {
    public int findMaxLength5(int[] nums) {
        int maxlength = 0;
        for (int start = 0; start < nums.length; start++) {
            int count0 = 0, count1 = 0;
            for (int end = start; end < nums.length; end++) {
                if (nums[end] == 0) {
                    count0++;
                } else {
                    count1++;
                }
                if (count1 == count0) {
                	maxlength = Math.max(maxlength, end - start + 1);
                } 
            }
            if(maxlength >= Math.min(count1, count0)*2) break;
        }
        return maxlength;
    }
    
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0, sum01 = 0;
        map.put(0, -1);
        for (int start = 0; start < nums.length; start++) {
        	sum01 += nums[start] == 0 ? -1 : 1;
            if (map.containsKey(sum01)) {
                maxLength = Math.max(maxLength, start - map.get(sum01));
            } else {
                map.put(sum01, start);
            }
        }
        return maxLength;
    }
}
