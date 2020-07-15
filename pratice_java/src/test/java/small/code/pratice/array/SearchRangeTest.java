package small.code.pratice.array;

import org.junit.jupiter.api.Test;

public class SearchRangeTest {
	@Test
	void testSearchRange() {
		new SearchRange().searchRange(new int[] {1}, 1);
		new SearchRange().searchRange(new int[] {1}, 0);
		new SearchRange().searchRange(new int[] {2,2}, 3);
		new SearchRange().searchRange(new int[] {}, 8);
		new SearchRange().searchRange(new int[] {5,7,7,8,8,10}, 8);
		new SearchRange().searchRange(new int[] {5,7,7,8,8,10}, 6);
	}
}
