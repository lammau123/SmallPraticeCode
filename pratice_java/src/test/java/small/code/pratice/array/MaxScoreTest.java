package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MaxScoreTest {
	@Test
	void testMaxScore() {
		assertTrue(new MaxScore().maxScore(new int [] {1,79,80,1,1,1,200,1}, 3) == 202);
		assertTrue(new MaxScore().maxScore(new int [] {1,2,3,4,5,6,1}, 3) == 12);
		assertTrue(new MaxScore().maxScore(new int [] {2,2,2}, 2) == 4);
		assertTrue(new MaxScore().maxScore(new int [] {9,7,7,9,7,7,9}, 7) == 55);
		assertTrue(new MaxScore().maxScore(new int [] {1,1000,1}, 1) == 1);
	}
}
