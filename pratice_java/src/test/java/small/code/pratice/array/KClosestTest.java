package small.code.pratice.array;

import org.junit.jupiter.api.Test;

public class KClosestTest {
	@Test
	void testKClosest() {
		new KClosest().kClosest(new int[][] {{0,1},{1,0}}, 2);
		new KClosest().kClosest(new int[][] {{1,3},{-2,2}}, 1);
		new KClosest().kClosest(new int[][] {{3,3},{5,-1},{-2,4}}, 2);
	}
}
