package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CheckStraightLineTest {
	@Test
	void testCheckStraightLine() {
		assertTrue(new CheckStraightLine().checkStraightLine(new int[][] {{-3,-2},{-1,-2},{2,-2},{-2,-2},{0,-2}}) == true);
		assertTrue(new CheckStraightLine().checkStraightLine(new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}) == true);
		assertTrue(new CheckStraightLine().checkStraightLine(new int[][] {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}) == false);
	}
}
