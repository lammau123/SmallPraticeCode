package small.code.pratice.list;

/**
 * Palindrome Linked List
 * 
 * Given a singly linked list, determine if it is a palindrome.
 * 
 * Example 1:
 * 
 * Input: 1->2
 * Output: false
 * 
 * Example 2:
 * 
 * Input: 1->2->2->1
 * Output: true
 * 
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 *
 */
public class IsPalindrome {
	static public class ListNode {
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
	
	private ListNode reverseList(ListNode head) {
		ListNode reverseHead = null;
		while(head != null) {
			ListNode tmp = head;
			head = head.next;
			tmp.next = reverseHead;
			reverseHead = tmp;
		}
		
		return reverseHead;
	}
	
    public boolean isPalindrome(ListNode head) {
    	ListNode fast = head, slow = head;
    	
    	while(fast != null && fast.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	
    	ListNode reverse = reverseList(slow);
    	
    	while(reverse != null && head != null) {
    		if(head.val != reverse.val) {
    			return false;
    		}
    		head = head.next;
    		reverse = reverse.next;
    	}
    	
    	return true;
    }
}
