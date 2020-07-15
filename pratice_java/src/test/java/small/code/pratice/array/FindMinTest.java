package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FindMinTest {
	@Test
	void testFindMin() {
		assertTrue(new FindMin().findMin(new int[] {1,2}) == 1);
	}
}
