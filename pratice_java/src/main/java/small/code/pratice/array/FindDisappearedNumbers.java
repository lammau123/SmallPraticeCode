package small.code.pratice.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All Numbers Disappeared in an Array
 * 
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear 
 * twice and others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned 
 * list does not count as extra space.
 * 
 * Example:
 * 
 * Input:
 * [4,3,2,7,8,2,3,1]
 * 
 * Output:
 * [5,6]
 *
 */
public class FindDisappearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
        for(int start = 0; start < nums.length; start++) {
          	nums[Math.abs(nums[start])-1] = -Math.abs(nums[Math.abs(nums[start])-1]);
        }
        for(int start = 0; start < nums.length; start++) {
        	if(nums[start] > 0) {
        		list.add(start+1);
        	}
        }
        
        return list;
    }
}
