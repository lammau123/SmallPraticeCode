package small.code.pratice.array;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given two arrays, write a function to compute their intersection.
 * Example 1:
 * 	Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * 	Output: [2,2]
 * 
 * Example 2:
 * 	Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 	Output: [4,9]
 * 
 * Note:
 * 
 * Each element in the result should appear as many times as it shows 
 * in both arrays.
 * The result can be in any order.
 * 
 * Follow up:
 * What if the given array is already sorted? How would you optimize 
 * your algorithm? What if nums1's size is small compared to nums2's 
 * size? Which algorithm is better? What if elements of nums2 are 
 * stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 * 
 */
public class Intersect {
	public int[] intersect(int[] nums1, int[] nums2) {
        final Map<Integer, Long> map = IntStream.of(nums1).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return IntStream.of(nums2).filter(num -> 
        	map.getOrDefault(num, 0L) == 0 ? false : 
        		map.computeIfPresent(num, (k,v) -> v-1) != null).toArray();        
    }
}
