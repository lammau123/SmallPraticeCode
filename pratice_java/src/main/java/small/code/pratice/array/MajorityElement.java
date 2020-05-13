package small.code.pratice.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Majority Element
 * 
 * Given an array of size n, find the majority element. The majority element is the 
 * element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always exist 
 * in the array.
 * 
 * Example 1:
 * 
 * Input: [3,2,3]
 * Output: 3
 * 
 * Example 2:
 * 
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 *
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0, value=0;
        for(int num: nums) {
        	int current = map.compute(num, (k,v) -> v == null ? 1 : v + 1);
        	if(max < current) {
        		max = current;
        		value = num;
        	}
        }
        
        return value;
    }
}
