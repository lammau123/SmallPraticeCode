package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MaxAreaTTest {
	@Test
	void testmaxArea() {
		assertTrue(new MaxArea().maxArea(5, 4, new int[] {1,2,4}, new int[] {1, 3})==4);
		assertTrue(new MaxArea().maxArea(5, 4, new int[] {3,1}, new int[] {1})==6);
	}
}
