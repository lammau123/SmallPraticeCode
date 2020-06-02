package small.code.pratice.string;

public class MinDistance {
    public int minDistance(String word1, String word2) {
    	int[][] dp = new int[word2.length()+1][word1.length()+1];
    	for(int col = 0; col < dp[0].length; col++) {
    		dp[0][col] = col;
    	}
    	for(int row = 0; row < dp.length; row++) {
    		dp[row][0] = row;
    	}
    	
    	for(int row = 1; row < dp.length; row++) {
    		for(int col = 1; col < dp[row].length; col++) {
    			if(word2.charAt(row) == word1.charAt(col)) {
    				dp[row][col] = dp[row-1][col-1];
    			} else {
    				dp[row][col] = 1 + Math.min(dp[row][col - 1], // remove 
                            Math.min(dp[row - 1][col], // insert 
                            dp[row - 1][col - 1])); // Replace 
    			}
    		}
    	}
    	
    	return dp[dp.length-1][dp[0].length-1];
    }
}
