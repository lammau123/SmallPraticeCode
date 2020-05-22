package small.code.pratice.array;

/**
 * Maximal Square
 * 
 * Given a 2D binary matrix filled with 0's and 1's, find the largest 
 * square 
 * containing only 1's and return its area.
 * 
 * Example:
 * 
 * Input: 
 * 
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * 
 * Output: 4
 *
 */
public class MaximalSquare {
	public int maximalSquare(char[][] matrix) {
		if(matrix.length <= 0 || matrix[0].length <= 0) return 0;
		int[][] dp = new int[matrix.length][matrix[0].length];
		int max = 0;
		for(int col = 0; col < dp[0].length; col++) {
			dp[0][col] = Character.getNumericValue(matrix[0][col]);
			max = Math.max(max, dp[0][col]);
		}
		for(int row = 0; row < dp.length; row++) {
			dp[row][0] = Character.getNumericValue(matrix[row][0]);
			max = Math.max(max, dp[row][0]);
		}
		
		for(int row = 1; row < dp.length; row++) {
			for(int col = 1; col < dp[0].length; col++) {
				if(matrix[row][col] == '1') {
					dp[row][col] = Math.min(dp[row-1][col-1], Math.min(dp[row-1][col], dp[row][col-1])) + 1;
					max = Math.max(max, dp[row][col]);
				} else {
					dp[row][col] = 0;
				}
			}
		}
		
		return max*max;
    }
}
