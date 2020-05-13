package small.code.pratice.array;

import org.junit.jupiter.api.Test;

public class BuildArrayTest {
	@Test
	void testBuildArray() {
		new BuildArray().buildArray(new int[] {2,3,4}, 4);
		new BuildArray().buildArray(new int[] {1,2,3}, 3);
		new BuildArray().buildArray(new int[] {1,2}, 4);
		new BuildArray().buildArray(new int[] {1,3}, 3);
	}
}
