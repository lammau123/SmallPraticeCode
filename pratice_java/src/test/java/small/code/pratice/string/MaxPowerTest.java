package small.code.pratice.string;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MaxPowerTest {
	@Test
	void testMaxPower() {
		assertTrue(new MaxPower().maxPower("leetcode") == 2);
		assertTrue(new MaxPower().maxPower("abbcccddddeeeeedcba") == 5);
		assertTrue(new MaxPower().maxPower("triplepillooooow") == 5);
		assertTrue(new MaxPower().maxPower("hooraaaaaaaaaaay") == 11);
		assertTrue(new MaxPower().maxPower("tourist") == 1);
		assertTrue(new MaxPower().maxPower("") == 0);
		
	}
}
