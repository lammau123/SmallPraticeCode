package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FindNumbersTest {
	@Test
	void testfindNumbers() {
		assertTrue(new FindNumbers().findNumbers(new int[] {12,345,2,6,7896}) == 2);
		assertTrue(new FindNumbers().findNumbers(new int[] {555,901,482,1771}) == 1);
	}
}
