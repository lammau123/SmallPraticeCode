package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ScheduleCourseTest {
	@Test
	void testScheduleCourse() {
		assertTrue(new ScheduleCourse().scheduleCourse(new int[][] {{9,20},{4,14},{4,10},{6,7},{2,14},{8,10},{6,6},{5,7}}) == 4);
		assertTrue(new ScheduleCourse().scheduleCourse(new int[][] {{5,5}, {4,6}, {2,6}}) == 2);
		assertTrue(new ScheduleCourse().scheduleCourse(new int[][] {{7,17},{3,12},{10,20},{9,10},{5,20},{10,19},{4,18}}) == 4);
		assertTrue(new ScheduleCourse().scheduleCourse(new int[][] {{5,15},{3,19},{6,7},{2,10},{5,16},{8,14},{10,11},{2,19}}) == 5);
		assertTrue(new ScheduleCourse().scheduleCourse(new int[][] {{5,5}, {4,6}, {2,6}}) == 2);
		assertTrue(new ScheduleCourse().scheduleCourse(new int[][] {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}}) == 3);
		assertTrue(new ScheduleCourse().scheduleCourse(new int[][] {{1, 2}}) == 1);
	}
}
