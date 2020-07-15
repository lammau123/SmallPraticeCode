package small.code.pratice.string;

/**
 * Is Subsequence
 * 
 * Given a string s and a string t, check if s is subsequence of t.
 * 
 * A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).
 * 
 * Follow up:
 * If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to see if T has its subsequence. In this scenario, how would you change your code?
 * 
 * Credits:
 * Special thanks to @pbrother for adding this problem and creating all test cases.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * 
 * Example 2:
 * 
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 * 
 *  
 * 
 * Constraints:
 * 
 *     0 <= s.length <= 100
 *     0 <= t.length <= 10^4
 *     Both strings consists only of lowercase characters.
 *
 */
public class Subsequence {
    public boolean isSubsequence(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for(int i = sChar.length - 1; i >= 0; i--) {
        	for(int j = tChar.length - 1; j >= 0; j--) {
        		if(sChar[i] == tChar[j]) {
        			dp[i][j] += dp[i+1][j+1] + 1;
        		} else {
        			dp[i][j] = Math.max(dp[i+1][j+1], Math.max(dp[i+1][j], dp[i][j+1]));
        		}
        	}
        }
        
        return (dp[0][0] == s.length());
    }
}
