package small.code.pratice.list;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SkiplistTest {
	@Test
	void testSkiplist() {
		Skiplist skipList = new Skiplist();
		skipList.add(6);
		skipList.add(2);
		skipList.add(3);
		skipList.add(7);
		
		assertTrue(skipList.search(7) == true);
		assertTrue(skipList.search(8) == false);
		assertTrue(skipList.search(-1) == false);
		assertTrue(skipList.search(3) == true);
		
		skipList.erase(2);
		skipList.erase(7);
		
		assertTrue(skipList.search(7) == false);
		assertTrue(skipList.search(8) == false);
		assertTrue(skipList.search(2) == false);
		assertTrue(skipList.search(3) == true);
	}
}
