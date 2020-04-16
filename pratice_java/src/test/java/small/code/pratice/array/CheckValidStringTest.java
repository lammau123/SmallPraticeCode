package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CheckValidStringTest {
	@Test
	void testCheckValidString() {
		assertFalse(new CheckValidString().checkValidString("*()(())*()(()()((()(()()*)(*(())((((((((()*)(()(*)"));
		assertFalse(new CheckValidString().checkValidString(")("));
		assertFalse(new CheckValidString().checkValidString(")()"));
		assertTrue(new CheckValidString().checkValidString("(*()"));
		assertTrue(new CheckValidString().checkValidString("()"));
		assertTrue(new CheckValidString().checkValidString("(*)"));
	}
}
