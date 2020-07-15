package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FindLeastNumOfUniqueIntsTest {
	@Test
	void testFindLeastNumOfUniqueInts() {
		assertTrue(new FindLeastNumOfUniqueInts().findLeastNumOfUniqueInts(new int[] {2,1,1,3,3,3}, 3) == 1);
		assertTrue(new FindLeastNumOfUniqueInts().findLeastNumOfUniqueInts(new int[] {5,5,4}, 1) == 1);
		assertTrue(new FindLeastNumOfUniqueInts().findLeastNumOfUniqueInts(new int[] {4,3,1,1,3,3,2}, 3) == 2);
	}
}
