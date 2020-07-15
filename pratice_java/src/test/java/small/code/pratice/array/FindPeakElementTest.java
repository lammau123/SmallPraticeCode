package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FindPeakElementTest {
	@Test
	void testFindPeakElement() {
		assertTrue(new FindPeakElement().findPeakElement(new int[] {1,2}) == 1);
		assertTrue(new FindPeakElement().findPeakElement(new int[] {2,1}) == 0);
		assertTrue(new FindPeakElement().findPeakElement(new int[] {1}) == 0);
		assertTrue(new FindPeakElement().findPeakElement(new int[] {1,2,3,1}) == 2);
		assertTrue(new FindPeakElement().findPeakElement(new int[] {1,2,1,3,5,6,4}) == 1);
	}
}
