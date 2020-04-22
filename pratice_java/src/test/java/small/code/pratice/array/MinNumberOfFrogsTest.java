package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MinNumberOfFrogsTest {
	@Test
	void testminNumberOfFrogs() {
		assertTrue(new MinNumberOfFrogs().minNumberOfFrogs("crocakcroraoakk") == 3);
		assertTrue(new MinNumberOfFrogs().minNumberOfFrogs("crocracokrakoak") == 3);
		assertTrue(new MinNumberOfFrogs().minNumberOfFrogs("croakcroak") == 1);
		assertTrue(new MinNumberOfFrogs().minNumberOfFrogs("crcoakroak") == 2);
		assertTrue(new MinNumberOfFrogs().minNumberOfFrogs("croakcrook") == -1);
		assertTrue(new MinNumberOfFrogs().minNumberOfFrogs("croakcroa") == -1);
		assertTrue(new MinNumberOfFrogs().minNumberOfFrogs("crocracokrakoak") == 3);
		
	}
}
