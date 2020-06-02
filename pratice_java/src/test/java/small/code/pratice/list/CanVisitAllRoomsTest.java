package small.code.pratice.list;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class CanVisitAllRoomsTest {
	@Test
	void testCanVisitAllRooms() {
		assertTrue(new CanVisitAllRooms().canVisitAllRooms(Arrays.asList(Arrays.asList(new Integer(1)), Arrays.asList(new Integer(2)), Arrays.asList(new Integer(3)), new ArrayList<>())) == true);
	}
}
