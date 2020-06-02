package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PossibleBipartitionTest {
	@Test
	void testPossibleBipartition() {
		assertTrue(new PossibleBipartition().possibleBipartition(4, new int[][]{{1,2},{1,3},{2,4}}));
		assertTrue(new PossibleBipartition().possibleBipartition(3, new int[][]{{1,2},{1,3},{2,3}}) == false);
		assertTrue(new PossibleBipartition().possibleBipartition(5, new int[][]{{1,2},{2,3},{3,4},{4,5},{1,5}}) == false);
	}
}
