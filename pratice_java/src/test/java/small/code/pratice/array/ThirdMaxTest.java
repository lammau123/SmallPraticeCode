package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ThirdMaxTest {
	@Test
	void testThirdMax() {
		assertTrue(new ThirdMax().thirdMax(new int[] {1,-2147483648,2})==-2147483648);
		assertTrue(new ThirdMax().thirdMax(new int[] {1,2,2,5,3,5})==2);
		assertTrue(new ThirdMax().thirdMax(new int[] {1,2,-2147483648})==-2147483648);
		assertTrue(new ThirdMax().thirdMax(new int[] {2, 2, 3, 1})==1);
		assertTrue(new ThirdMax().thirdMax(new int[] {3, 2, 1})==1);
		assertTrue(new ThirdMax().thirdMax(new int[] {1, 2})==2);
	}
}
