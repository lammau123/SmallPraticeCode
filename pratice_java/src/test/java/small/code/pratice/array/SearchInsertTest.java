package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SearchInsertTest {
	@Test
	void testSearchInsert() {
		assertTrue(new SearchInsert().searchInsert(new int[] {1,3,5,6}, 2) == 1);
		assertTrue(new SearchInsert().searchInsert(new int[] {1,3,5,6}, 5) == 2);
		assertTrue(new SearchInsert().searchInsert(new int[] {1,3,5,6}, 7) == 4);
		assertTrue(new SearchInsert().searchInsert(new int[] {1,3,5,6}, 0) == 0);
	}
}
