package small.code.pratice.array;

import org.junit.jupiter.api.Test;

public class RandomizedSetTest {
	@Test
	void testRandomizedSet() {
		RandomizedSet rd = new RandomizedSet();
		rd.remove(0);
		rd.remove(0);
		rd.insert(0);
		rd.getRandom();
		rd.remove(0);
		rd.insert(0);
	}
}
