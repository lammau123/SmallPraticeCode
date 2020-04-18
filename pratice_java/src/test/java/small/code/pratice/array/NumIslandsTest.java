package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumIslandsTest {
	@Test
	void testNumIslands() {
		assertTrue(new NumIslands().numIslands(new char[][] {{'1','1','1','1','0'}, 
															{'1','1','0','1','0'},
															{'1','1','0','0','0'},
															{'0','0','0','0','0'}}) == 1);
		assertTrue(new NumIslands().numIslands(new char[][] {{'1','1','0','0','0'}, 
															{'1','1','0','0','0'},
															{'0','0','1','0','0'},
															{'0','0','0','1','1'}}) == 3);
	}
}
