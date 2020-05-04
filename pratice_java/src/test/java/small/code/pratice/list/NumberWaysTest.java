package small.code.pratice.list;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class NumberWaysTest {
	@Test
	void testNumberWays() {
		assertTrue(new NumberWays().
						numberWays(Arrays.asList(Arrays.asList(1,2,3),
								Arrays.asList(2,3,5,6), 
								Arrays.asList(1,3,7,9),
								Arrays.asList(1,8,9),
								Arrays.asList(2,5,7))) == 111);
		assertTrue(new NumberWays().
				numberWays(Arrays.asList(Arrays.asList(3,4),
						Arrays.asList(4,5), Arrays.asList(5))) == 1);
		List<List<Integer>> ls = Arrays.asList(
				Arrays.asList(1,2,3,4,5,7,9,11,12,13,17,18,19,20,21,22,23,24,25),
				Arrays.asList(1,2,3,4,5,6,7,8,9,12,13,14,15,16,18,20,21,22,24,25),
				Arrays.asList(2,3,7,12,13,15,19,22,23,24),
				Arrays.asList(6,9,11,12,14,15,16,17,20,22,24,25),
				Arrays.asList(10),
				Arrays.asList(19,21,24),
				Arrays.asList(1,3,5,6,8,10,11,13,14,15,16,17,18,20,22,24,25),
				Arrays.asList(3,7,9));
		
		assertTrue(new NumberWays().
				numberWays(ls) == 1);
		
	}
}
