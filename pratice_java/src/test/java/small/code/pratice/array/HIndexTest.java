package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HIndexTest {
	@Test
	void testHIndex() {
													//[1, 1, 0, 1, 0, 2]
		//assertTrue(new HIndex().hIndex1(new int[] {3,0,6,1,5}) == 3);
		assertTrue(new HIndex().hIndex1(new int[] {1,1,1,1,1}) == 3);
		//assertTrue(new HIndex().hIndex(new int[] {0,1,4,5,6}) == 3);
		//assertTrue(new HIndex().hIndex1(new int[] {0,4,5,6,7}) == 4);
		//assertTrue(new HIndex().hIndex1(new int[] {0,1,2,3}) == 4);
	}
}
