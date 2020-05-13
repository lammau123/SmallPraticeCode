package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CountTripletsTest {
	@Test
	void testCountTriplets() {
		assertTrue(new CountTriplets().countTriplets(new int[] {7,11,12,9,5,2,7,17,22}) == 8);
		assertTrue(new CountTriplets().countTriplets(new int[] {1,3,5,7,9}) == 3);
		assertTrue(new CountTriplets().countTriplets(new int[] {2,3}) == 0);
		assertTrue(new CountTriplets().countTriplets(new int[] {1,1,1,1,1}) == 10);
		assertTrue(new CountTriplets().countTriplets(new int[] {2,3,1,6,7}) == 4);
	}
}
