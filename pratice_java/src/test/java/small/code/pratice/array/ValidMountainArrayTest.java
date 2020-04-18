package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidMountainArrayTest {
	@Test
	void testValidMountainArray() {
		assertTrue(new ValidMountainArray().validMountainArray(new int[] {0, 0, 1, 2, 3, 1, 2, 3}) == false);
		assertTrue(new ValidMountainArray().validMountainArray(new int[] {2, 1}) == false);
		assertTrue(new ValidMountainArray().validMountainArray(new int[] {3,5,5}) == false);
		assertTrue(new ValidMountainArray().validMountainArray(new int[] {3,5,5}) == false);
		assertTrue(new ValidMountainArray().validMountainArray(new int[] {0,3,2,1}) == true);
	}
}
