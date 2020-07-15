package small.code.pratice.array;

import org.junit.jupiter.api.Test;

public class ShuffleTest {
	@Test
	void testShuffle() {
		new Shuffle().shuffle(new int[] {2,5,1,3,4,7}, 3);
		new Shuffle().shuffle(new int[] {1,2,3,4,4,3,2,1}, 4);
		new Shuffle().shuffle(new int[] {1,1,2,2}, 2);
	}
}
