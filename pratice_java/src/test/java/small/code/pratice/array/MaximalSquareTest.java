package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MaximalSquareTest {
	@Test
	void testMaximalSquare() {
		assertTrue(new MaximalSquare().maximalSquare(new char[] [] {{'1','0','1','0','0'},
																	{'1','0','1','1','1'},
																	{'1','1','1','1','1'},
																	{'1','0','0','1','0'}}) == 4);
	}
}
