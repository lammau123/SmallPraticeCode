package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FindJudgeTest {
	@Test
	void testFindJudge() {
		assertTrue(new FindJudge().findJudge(2, new int[][] {{1,2}}) == 2);
		assertTrue(new FindJudge().findJudge(3, new int[][] {{1,3},{2,3}}) == 3);
		assertTrue(new FindJudge().findJudge(3, new int[][] {{1,3},{2,3},{3,1}}) == -1);
		assertTrue(new FindJudge().findJudge(3, new int[][] {{1,2},{2,3}}) == -1);
		assertTrue(new FindJudge().findJudge(4, new int[][] {{1,3},{1,4},{2,3},{2,4},{4,3}}) == 3);
	}
}
