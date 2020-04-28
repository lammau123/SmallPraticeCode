package small.code.pratice.string;

public class LongestCommonSubsequence {
	public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        
        for(int endText1 = text1.length()-1; endText1 >= 0; endText1--) {
        	for(int endText2 = text2.length()-1; endText2 >= 0; endText2--) {
            	dp[endText1][endText2] = dp[endText1+1][endText2+1];
            	if(text1.charAt(endText1) == text2.charAt(endText2)) {
            		dp[endText1][endText2]++;
            	}
            	if(dp[endText1+1][endText2] > dp[endText1][endText2]) {
            		dp[endText1][endText2] = dp[endText1+1][endText2];
            	}
            	if(dp[endText1][endText2+1] > dp[endText1][endText2]) {
            		dp[endText1][endText2] = dp[endText1][endText2+1]; 
            	}
            }
        }
        return dp[0][0];
    }
}
