package small.code.pratice.array;

import java.util.Arrays;

/**
 * Maximum Product of Two Elements in an Array
 * @author mlam21
 *
 */
public class MaxProduct {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
