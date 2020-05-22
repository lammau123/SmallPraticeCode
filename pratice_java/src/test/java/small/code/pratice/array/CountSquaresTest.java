package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CountSquaresTest {
	@Test
	void testCountSquares() {
		assertTrue(new CountSquares().countSquares(new int[][] {{0,1,1,1},{1,1,1,1},{0,1,1,1}})  == 15);
		assertTrue(new CountSquares().countSquares(new int[][] {{1,0,1},{1,1,0},{1,1,0}})  == 7);
	}
}
