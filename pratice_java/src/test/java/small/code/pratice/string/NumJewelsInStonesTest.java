package small.code.pratice.string;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumJewelsInStonesTest {
	@Test
	void testNumJewelsInStones() {
		assertTrue(new NumJewelsInStones().numJewelsInStones("aA", "aAAbbbb") == 3);
		assertTrue(new NumJewelsInStones().numJewelsInStones("z", "ZZZ") == 0);
	}
}
