package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FloodFillTest {
	@Test
	void testFloodFill() {
		assertTrue(check(new FloodFill().floodFill(new int[][] {{0,0,0},{0,0,1}}, 1, 0, 2), new int[][] {{2,2,2},{2,2,1}}));
		assertTrue(check(new FloodFill().floodFill(new int[][] {{0,0,0},{1,1,1}}, 1, 1, 1), new int[][] {{0,0,0},{1,1,1}}));
		assertTrue(check(new FloodFill().floodFill(new int[][] {{0,0,0},{0,1,1}}, 1, 1, 1), new int[][] {{0,0,0},{0,1,1}}));
		assertTrue(check(new FloodFill().floodFill(new int[][] {{0,0,0},{0,0,0}}, 0, 0, 2), new int[][] {{2,2,2},{2,2,2}}));
		assertTrue(check(new FloodFill().floodFill(new int[][] {{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2), new int[][] {{2,2,2},{2,2,0},{2,0,1}}));
	}
	
	private boolean check(int[][] src, int[][] des) {
		for(int i = 0; i < src.length; i++) {
			for(int j = 0; j < src[0].length; j++) {
				if(src[i][j] != des[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
