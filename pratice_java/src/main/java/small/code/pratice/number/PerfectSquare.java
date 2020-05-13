package small.code.pratice.number;

/**
 * Valid Perfect Square
 * 
 * Given a positive integer num, write a function which returns True if num is 
 * a perfect square else False.
 * 
 * Note: Do not use any built-in library function such as sqrt.
 * 
 * Example 1:
 * 
 * Input: 16
 * Output: true
 * 
 * Example 2:
 * 
 * Input: 14
 * Output: false
 *
 */
public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
    	int first = 1, last = num;
        while(first <= last) {
        	int mid = first + (last - first)/2;
        	int sqrt = num/mid;
        	if(mid == sqrt && num%mid == 0) {
        		return true;
        	}
        	if(mid > sqrt) {
        		last = mid-1;
        	} else {
        		first = mid+1;
        	}
        }
        return false;
    }
}
