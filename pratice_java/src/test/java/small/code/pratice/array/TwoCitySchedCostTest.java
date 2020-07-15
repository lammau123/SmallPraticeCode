package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TwoCitySchedCostTest {
	@Test
	void testTwoCitySchedCost() {
		assertTrue(new TwoCitySchedCost().twoCitySchedCost(new int[][] {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}}) == 1859);
		assertTrue(new TwoCitySchedCost().twoCitySchedCost(new int[][] {{10,20},{30,200},{400,50},{30,20}}) == 110);
	}
}
