package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RotatedSortedArrayTest {
	@Test
	void testRotatedSortedArray() {
		assertTrue(new RotatedSortedArray().search(new int[] {}, 5) == -1);
		assertTrue(new RotatedSortedArray().search(new int[] {4,5,6,7,0,1,2}, 0) == 4);
		assertTrue(new RotatedSortedArray().search(new int[] {4,5,6,7,0,1,2}, 3) == -1);
	}
}
