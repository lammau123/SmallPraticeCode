package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Coin2Test {
	@Test
	void testCoin2() {
		assertTrue(new Coin2().change(5, new int[] {1, 2, 5}) == 4);
		assertTrue(new Coin2().change(3, new int[] {2}) == 0);
		assertTrue(new Coin2().change(10, new int[] {10}) == 1);
	}
}
