package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FindMinFibonacciNumbersTest {
	@Test
	void testFindMinFibonacciNumbers() {
		assertTrue(new FindMinFibonacciNumbers().findMinFibonacciNumbers(7) == 2);
		assertTrue(new FindMinFibonacciNumbers().findMinFibonacciNumbers(10) == 2);
		assertTrue(new FindMinFibonacciNumbers().findMinFibonacciNumbers(19) == 3);
	}
}
