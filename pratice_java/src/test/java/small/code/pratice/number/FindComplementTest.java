package small.code.pratice.number;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FindComplementTest {
	@Test
	void testFindComplement() {
		assertTrue(new FindComplement().findComplement(5) == 2);
		assertTrue(new FindComplement().findComplement(1) == 0);
	}
}
