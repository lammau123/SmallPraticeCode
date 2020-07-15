package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ShipWithinDaysTest {
	@Test
	void testShipWithinDays() {
		assertTrue(new ShipWithinDays().shipWithinDays(new int[] {1,2,3,4,5,6,7,8,9,10}, 5) == 15);
		assertTrue(new ShipWithinDays().shipWithinDays(new int[] {3,2,2,4,1,4}, 3) == 6);
		assertTrue(new ShipWithinDays().shipWithinDays(new int[] {1,2,3,1,1}, 4) == 3);
	}
}
