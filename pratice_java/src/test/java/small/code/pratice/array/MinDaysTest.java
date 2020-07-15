package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MinDaysTest {
	@Test
	void testMinDays() {
		assertTrue(new MinDays().minDays(new int[] {1,10,3,10,2}, 3, 1) == 3);
		assertTrue(new MinDays().minDays(new int[] {1,10,3,10,2}, 3, 2) == -1);
		assertTrue(new MinDays().minDays(new int[] {7,7,7,7,12,7,7}, 2, 3) == 12);
		assertTrue(new MinDays().minDays(new int[] {1000000000,1000000000}, 1, 1) == 1000000000);
		assertTrue(new MinDays().minDays(new int[] {1,10,2,9,3,8,4,7,5,6}, 4, 2) == 9);
	}
}
