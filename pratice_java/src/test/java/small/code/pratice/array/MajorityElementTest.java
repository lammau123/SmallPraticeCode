package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MajorityElementTest {
	@Test
	void testMajorityElement() {
		assertTrue(new MajorityElement().majorityElement(new int[] {3,2,3}) == 3);
		assertTrue(new MajorityElement().majorityElement(new int[] {2,2,1,1,1,2,2}) == 2);
	}
}
