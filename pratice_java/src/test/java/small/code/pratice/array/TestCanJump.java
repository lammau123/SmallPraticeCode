package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestCanJump {
	@Test
	void testCanJump() {
		assertTrue(new CanJump().canJump(new int[] {3,0,8,2,0,0,1}) == true);
		assertTrue(new CanJump().canJump(new int[] {1}) == true);
		assertTrue(new CanJump().canJump(new int[] {2,3,1,1,4}) == true);
		assertTrue(new CanJump().canJump(new int[] {3,2,1,0,4}) == false);
		assertTrue(new CanJump().canJump(new int[] {0}) == true);
		assertTrue(new CanJump().canJump(new int[] {2, 0, 0}) == true);
		assertTrue(new CanJump().canJump(new int[] {2, 5, 0, 0}) == true);
	}
}
