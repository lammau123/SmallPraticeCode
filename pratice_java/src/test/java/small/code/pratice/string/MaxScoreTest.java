package small.code.pratice.string;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MaxScoreTest {
	@Test
	void testMaxScore() {
		assertTrue(new MaxScore().maxScore("110000") == 3);
		assertTrue(new MaxScore().maxScore("0100") == 2);
		assertTrue(new MaxScore().maxScore("00") == 1);
		assertTrue(new MaxScore().maxScore("1111") == 3);
		assertTrue(new MaxScore().maxScore("011101") == 5);
		assertTrue(new MaxScore().maxScore("00111") == 5);
	}
}
