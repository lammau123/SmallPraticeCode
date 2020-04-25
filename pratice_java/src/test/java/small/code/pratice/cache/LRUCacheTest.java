package small.code.pratice.cache;

import org.junit.jupiter.api.Test;

public class LRUCacheTest {
	@Test
	void testLRUCache() {
		LRUCache lru =  new LRUCache(3);
		lru.put(1, 1);
		lru.put(2, 2);
		lru.put(3, 3);
		lru.put(4, 4);
		lru.put(7, 7);
		lru.put(6, 6);
		//lru.print();
	}
}
