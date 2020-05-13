package small.code.pratice.array;

/**
 * Check If It Is a Straight Line
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] 
 * represents the coordinate of a point. Check if these points make a straight 
 * line in the XY plane.
 * 
 *  
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * Output: true
 * 
 * Example 2:
 * 
 * Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
 * Output: false
 * 
 *  
 * 
 * Constraints:
 * 
 *     2 <= coordinates.length <= 1000
 *     coordinates[i].length == 2
 *     -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
 *     coordinates contains no duplicate point.
 * 
 *
 */
public class CheckStraightLine {
	public boolean checkStraightLine(int[][] coordinates) {
		if(coordinates.length <= 2) {
			return true;
		}       
		
		for(int pos = 0; pos < coordinates.length-3; pos++) {
			int dx = coordinates[pos+1][0] - coordinates[pos][0];
			int dy = coordinates[pos+1][1] - coordinates[pos][1];
			
			if(dy*(coordinates[pos+2][0] - coordinates[pos][0]) !=
					dx*(coordinates[pos+2][1] - coordinates[pos][1])) {
				return false;
			}
		}
		
		return true;
    }
}
