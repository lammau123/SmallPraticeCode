package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RemoveDuplicateTest {
	@Test
	void testRemoveDuplicate() {
		assertTrue(new RemoveDuplicate().removeDuplicates(new int[] {1,1,2}) == 2);
		assertTrue(new RemoveDuplicate().removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}) == 5);
	}
}
