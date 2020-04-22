package small.code.pratice.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Find the Minimum Number of Fibonacci Numbers Whose Sum Is K
 * 
 * 
 * Given the number k, return the minimum number of Fibonacci numbers whose sum is equal 
 * to k, whether a Fibonacci number could be used multiple times.
 * 
 * The Fibonacci numbers are defined as:
 * 
 * F1 = 1
 * F2 = 1
 * Fn = Fn-1 + Fn-2 , for n > 2.
 * 
 * It is guaranteed that for the given constraints we can always find such fibonacci 
 * numbers that sum k.
 * 
 * Example 1:
 * Input: k = 7
 * Output: 2 
 * 
 * Explanation: The Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, ...
 * For k = 7 we can use 2 + 5 = 7.
 * 
 * Example 2:
 * Input: k = 10
 * Output: 2 
 * Explanation: For k = 10 we can use 2 + 8 = 10.
 * 
 * Example 3:
 * 
 * Input: k = 19
 * Output: 3 
 * Explanation: For k = 19 we can use 1 + 5 + 13 = 19.
 * 
 * Constraints:
 * 
 * 1 <= k <= 10^9
 *
 */
public class FindMinFibonacciNumbers {
	public int findMinFibonacciNumbers(int k) {
        List<Integer> fb = new ArrayList<>();
        fb.add(0, 0);
        fb.add(1, 1);
        fb.add(2, 1);
        
        while(true) {
        	int n = fb.size()-1;
        	fb.add(fb.get(n-1)+fb.get(n));
        	if(fb.get(n+1) == k) {
        		return 1;
        	} else if(fb.get(n+1) > k) {
        		break;
        	}
        }
        
        int sum = 0, count = 0;
        for(int end = fb.size()-2; end > 0; end--) {
        	sum += fb.get(end);
        	count++;
        	if(sum == k) {
        		break;
        	} else if(sum > k){
        		sum -= fb.get(end);
        		count--;
        	}
        	
        }
        
        return count;
    }
}
