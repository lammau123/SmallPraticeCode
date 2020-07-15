package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FindCheapestPriceTest {
	@Test
	void testFindCheapestPrice() {
		assertTrue(new FindCheapestPrice().findCheapestPrice(5, new int[][] {{0,1,5},{1,2,5},{0,3,2},{3,1,2},{1,4,1},{4,2,1}}, 0, 2, 2) == 7);
		assertTrue(new FindCheapestPrice().findCheapestPrice(3, new int[][] {{0,1,100},{1,2,100},{0,2,500}}, 0, 5, 0) == -1);
		assertTrue(new FindCheapestPrice().findCheapestPrice(3, new int[][] {{0,1,100},{1,2,100},{0,2,500}}, 0, 2, 0) == 500);
		assertTrue(new FindCheapestPrice().findCheapestPrice(3, new int[][] {{0,1,100},{1,2,100},{0,2,500}}, 0, 2, 1) == 200);
	}
}
