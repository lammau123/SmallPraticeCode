package small.code.pratice.array;

import org.junit.jupiter.api.Test;

public class SortColorsTest {
	@Test
	void testSortColors() {
		new SortColors().sortColors(new int[] {1,1});
		new SortColors().sortColors(new int[] {2,2,1});
		new SortColors().sortColors(new int[] {2,0,2,1,1,0});
	}
}
