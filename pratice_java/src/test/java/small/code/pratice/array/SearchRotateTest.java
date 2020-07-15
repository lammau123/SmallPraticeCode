package small.code.pratice.array;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SearchRotateTest {
	@Test
	void testSearchRotate() {
		assertTrue(new SearchRotate().search2(new int[] {1,2,3,5}) == 4);
		assertTrue(new SearchRotate().search2(new int[] {1,3,4,5}) == 2);
		
		assertTrue(new SearchRotate().search1(new int[] {3,1,1}, 0) == false);
		assertTrue(new SearchRotate().search1(new int[] {3,1}, 1) == true);
		assertTrue(new SearchRotate().search1(new int[] {1,3,1,1,1}, 3) == true);
		//assertTrue(new SearchRotate().search(new int[] {4,5,6,7,0,1,2}, 0) == 4);
		//assertTrue(new SearchRotate().search(new int[] {4,5,6,7,0,1,2}, 3) == -1);
	}
}
