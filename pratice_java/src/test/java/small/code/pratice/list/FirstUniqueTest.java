package small.code.pratice.list;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FirstUniqueTest {
	@Test
	void testFirstUnique() {
		FirstUnique firstUnique = new FirstUnique(new int[] {2,3,5});
		assertTrue(firstUnique.showFirstUnique() == 2);
		firstUnique.add(5);
		assertTrue(firstUnique.showFirstUnique() == 2);
		firstUnique.add(2);
		assertTrue(firstUnique.showFirstUnique() == 3);
		firstUnique.add(3);
		assertTrue(firstUnique.showFirstUnique() == -1);
		
	}
}
