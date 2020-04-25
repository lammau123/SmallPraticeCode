package small.code.pratice.list;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
	@Test
	void testMyLinkedList() {
		MyLinkedList lst = new MyLinkedList();
		lst.addAtIndex(0, 10);
		lst.addAtIndex(0, 20);
		lst.addAtIndex(1, 30);
		assertTrue(lst.get(0) == 20);
	}
	
	@Test
	void testMyLinkedList1() {
		MyLinkedList lst = new MyLinkedList();
		lst.addAtHead(7);
		lst.addAtHead(2);
		lst.addAtHead(1);
		lst.addAtIndex(3,0);
		lst.deleteAtIndex(2);
		lst.addAtHead(6);
		lst.addAtTail(4);
		assertTrue(lst.get(4) == 4);
		lst.addAtTail(4);
		lst.addAtIndex(5, 0);
		lst.addAtHead(6);
	}
	
	@Test
	void testMyLinkedList2() {
		MyLinkedList lst = new MyLinkedList();
		lst.addAtHead(1);
		lst.addAtTail(3);
		lst.addAtIndex(1,2);
		assertTrue(lst.get(1) == 2);
		lst.deleteAtIndex(1);
		assertTrue(lst.get(1) == 3);
	}
	
	@Test
	void testMyLinkedList3() {
		MyLinkedList lst = new MyLinkedList();
		lst.addAtHead(1);
		lst.addAtTail(3);
		lst.addAtIndex(1,2);
		assertTrue(lst.get(1) == 2);
		lst.deleteAtIndex(1);
		assertTrue(lst.get(1) == 3);
	}
	
	@Test
	void testMyLinkedList4() {
		MyLinkedList lst = new MyLinkedList();
		lst.addAtHead(2);
		lst.deleteAtIndex(1);
		lst.addAtHead(2);
		lst.addAtHead(7);
		lst.addAtHead(3);
		lst.addAtHead(2);
		lst.addAtHead(5);
		lst.addAtTail(5);
		assertTrue(lst.get(5) == 2);
		lst.deleteAtIndex(6);
		lst.deleteAtIndex(4);
	}
}
