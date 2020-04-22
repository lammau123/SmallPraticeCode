package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ReformatTest {
	@Test
	void testReformat() {
		assertTrue(new Reformat().reformat("a0b1c2").equals("0a1b2c"));
	}
}
