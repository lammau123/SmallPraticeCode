package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CheckIfExistTest {
	@Test
	void testCheckIfExist() {
		assertFalse(new CheckIfExist().checkIfExist(new int[] {-2,0,10,-19,4,6,-8}));
		assertFalse(new CheckIfExist().checkIfExist(new int[] {-8,-2,11,12,17}));
		assertTrue(new CheckIfExist().checkIfExist(new int[] {0, 0}));
		assertFalse(new CheckIfExist().checkIfExist(new int[] {4,-7,11,4,18}));
		assertTrue(new CheckIfExist().checkIfExist(new int[] {10,2,5,3}));
		assertTrue(new CheckIfExist().checkIfExist(new int[] {7,1,14,11}));
		assertFalse(new CheckIfExist().checkIfExist(new int[] {3,1,7,11}));
	}
}
