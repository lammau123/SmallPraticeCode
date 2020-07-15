package small.code.pratice.array;

import org.junit.jupiter.api.Test;

public class StrongestTest {
	@Test
	void testStrongest() {
		new Strongest().getStrongest(new int[] {1,2,3,4,5}, 2);
		new Strongest().getStrongest(new int[] {1,1,3,5,5}, 2);
		new Strongest().getStrongest(new int[] {6,7,11,7,6,8}, 5);
		new Strongest().getStrongest(new int[] {6,-3,7,2,11}, 3);
		new Strongest().getStrongest(new int[] {-7,22,17,3}, 2);
	}
}
