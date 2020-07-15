package small.code.pratice.list;

import org.junit.jupiter.api.Test;

public class CopyRandomListTest {
	@Test
	void testCopyRandomList() {
		Node n7 = new Node(7);
		Node n13 = new Node(13);
		Node n11 = new Node(11);
		Node n10 = new Node(10);
		Node n1 = new Node(1);
		
		n7.next = n13;
		n13.next = n11;
		n11.next = n10;
		n10.next = n1;
		n13.random = n7;
		n11.random = n1;
		n10.random = n11;
		n1.random = n7;
		
		new CopyRandomList().copyRandomList(n7);
	}
}
