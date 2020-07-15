package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FindBestValueTest {
	@Test
	void testFindBestValue() {
		assertTrue(new FindBestValue().findBestValue(new int[] {4,9,3}, 10) == 3);
		assertTrue(new FindBestValue().findBestValue(new int[] {2,3,5}, 10) == 5);
		assertTrue(new FindBestValue().findBestValue(new int[] {60864,25176,27249,21296,20204}, 56803) == 11361);
	}
}
