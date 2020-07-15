package small.code.pratice.array;

import org.junit.jupiter.api.Test;

public class PricesTest {
	@Test
	void testPrices() {
		new Prices().finalPrices(new int[] {1,2,3,4,5});//1,2,3,4,5
		new Prices().finalPrices(new int[] {8,4,6,2,3});//4,2,4,2,3
		new Prices().finalPrices(new int[] {10,1,1,6});//9,0,1,6
	}
}
