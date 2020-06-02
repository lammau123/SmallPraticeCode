package small.code.pratice.string;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MaxVowelsTest {
	@Test
	void testMaxVowels() {
		assertTrue(new MaxVowels().maxVowels("tryhard", 4) == 1);
		assertTrue(new MaxVowels().maxVowels("leetcode", 3) == 2);
		assertTrue(new MaxVowels().maxVowels("abciiidef", 3) == 3);
		
	}
}
