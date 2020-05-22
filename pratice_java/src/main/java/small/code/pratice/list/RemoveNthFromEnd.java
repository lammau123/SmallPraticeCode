package small.code.pratice.list;

class RemoveNthFromEnd {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		head = new ListNode(0, head);
		ListNode first = head, second = head;
		for(int i = 1; i <= n+1; i++) {
			first = first.next;
		}
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		
		return head.next;
	}
}