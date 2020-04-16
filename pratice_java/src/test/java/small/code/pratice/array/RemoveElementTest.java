package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RemoveElementTest {
	@Test
	void testRemoveElement() {
		assertTrue(new RemoveElement().removeElement(new int[] {}, 0) == 0);
		assertTrue(new RemoveElement().removeElement(new int[] {0,1,2,2,3,0,4,2}, 2) == 5);
		assertTrue(new RemoveElement().removeElement(new int[] {3,2,2,3}, 3) == 2);
	}
}
