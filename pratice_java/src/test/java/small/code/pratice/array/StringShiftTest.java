package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringShiftTest {
	@Test
	void stringShiftTest() {
		assertTrue(new StringShift().stringShift("yisxjwry", new int[][] {{1,8},{1,4}, {1,3},{1,6},{0,6},{1,4},{0,2},{0,1}}).equals("yisxjwry"));
		assertTrue(new StringShift().stringShift("abc", new int[][] {{0,1},{1,2}}).equals("cab"));
		assertTrue(new StringShift().stringShift("abcdefg", new int[][] {{1,1},{1,1},{0,2},{1,3}}).equals("efgabcd"));
	}
}
