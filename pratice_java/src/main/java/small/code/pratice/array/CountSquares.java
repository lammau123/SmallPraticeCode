package small.code.pratice.array;

/**
Count Square Submatrices with All Ones

Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.

 

Example 1:

Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
Output: 15
Explanation: 
There are 10 squares of side 1.
 * There are 4 squares of side 2.
 * There is  1 square of side 3.
 * Total number of squares = 10 + 4 + 1 = 15.
 * 
 * Example 2:
 * 
 * Input: matrix = 
 * [
 *   [1,0,1],
 *   [1,1,0],
 *   [1,1,0]
 * ]
 * Output: 7
 * Explanation: 
 * There are 6 squares of side 1.  
 * There is 1 square of side 2. 
 * Total number of squares = 6 + 1 = 7.
 * 
 *  
 * 
 * Constraints:
 * 
 *     1 <= arr.length <= 300
 *     1 <= arr[0].length <= 300
 *     0 <= arr[i][j] <= 1
 *
 */
public class CountSquares {
	public int countSquares(int[][] matrix) {
		int count = 0;
		if(matrix.length <= 0 || matrix[0].length <= 0) return 0;
		int[][] dp = new int[matrix.length][matrix[0].length];
		for(int col = 0; col < dp[0].length; col++) {
			dp[0][col] = matrix[0][col];
			if(dp[0][col] == 1) {
				count++;
			}
		}
		for(int row = 1; row < dp.length; row++) {
			dp[row][0] = matrix[row][0];
			if(dp[row][0] == 1) {
				count++;
			}
		}
		
		for(int row = 1; row < dp.length; row++) {
			for(int col = 1; col < dp[0].length; col++) {
				if(matrix[row][col] == 1) {
					dp[row][col] = Math.min(dp[row-1][col-1], Math.min(dp[row-1][col], dp[row][col-1])) + 1;
					count += dp[row][col];
				} else {
					dp[row][col] = 0;
				}
			}
		}
		
		return count;
    }
}
