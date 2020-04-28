package small.code.pratice.string;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LongestCommonSubsequenceTest {
	@Test
	void testLongestCommonSubsequence() {
		assertTrue(new LongestCommonSubsequence().longestCommonSubsequence("abcde", "ace") == 3);
		assertTrue(new LongestCommonSubsequence().longestCommonSubsequence("abc", "abc") == 3);
		assertTrue(new LongestCommonSubsequence().longestCommonSubsequence("abc", "def") == 0);
	}
}
