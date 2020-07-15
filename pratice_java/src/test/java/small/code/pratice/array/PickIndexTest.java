package small.code.pratice.array;

import org.junit.jupiter.api.Test;

public class PickIndexTest {
	@Test
	void testPickIndex() {
		//PickIndex pick1 = new PickIndex(new int[] {1});
		//int t = pick1.pickIndex();
		
		PickIndex pick = new PickIndex(new int[] {3, 14, 1, 7});
		int v = pick.pickIndex();
		int v2 = pick.pickIndex();
		int v3 = pick.pickIndex();
		int v4 = pick.pickIndex();
		pick.pickIndex();
		pick.pickIndex();
		pick.pickIndex();
		pick.pickIndex();
	}
}
