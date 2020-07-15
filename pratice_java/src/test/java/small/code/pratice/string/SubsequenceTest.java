package small.code.pratice.string;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SubsequenceTest {
	@Test
	void testSubsequence() {
		assertTrue(new Subsequence().isSubsequence("abc", "ahbgdc") == true);
		assertTrue(new Subsequence().isSubsequence("axc", "ahbgdc") == false);
	}
}
