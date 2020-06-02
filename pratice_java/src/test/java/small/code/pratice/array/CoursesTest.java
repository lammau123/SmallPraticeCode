package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CoursesTest {
	@Test
	void testCourses() {
		assertTrue(new Courses().canFinish(7, new int[][] {{1,0},{0,3},{0,2},{3,2},{2,5},{4,5},{5,6},{2,4}}) == true);
		assertTrue(new Courses().canFinish(2, new int[][] {{1,0}}) == true);
		assertTrue(new Courses().canFinish(2, new int[][] {{1,0}, {0,1}}) == false);
		assertTrue(new Courses().canFinish(3, new int[][] {{1,0},{0,2},{2,1}}) == false );
		assertTrue(new Courses().canFinish(3, new int[][] {{1,0},{2,0}}) == true);
		assertTrue(new Courses().canFinish(3, new int[][] {{1,0},{2,1}}) == true);
		
	}
}
