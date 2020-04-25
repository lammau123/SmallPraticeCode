package small.code.pratice.range;

/**
 * Bitwise AND of Numbers Range
 * 
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all 
 * numbers in this range, inclusive.
 * 
 * Example 1:
 * Input: [5,7]
 * Output: 4
 * 
 * Example 2:
 * 
 * Input: [0,1]
 * Output: 0
 *
 */
public class RangeBitwiseAnd {
	public int rangeBitwiseAnd(int m, int n) {
		int rs = m;
		int start = m;
		while(true) {
        	rs &= start;
        	if(rs == 0) {
        		return rs;
        	}
        	if(start >= n) {
        		break;
        	}
        	start++;
        }
        return rs;
    }
}
