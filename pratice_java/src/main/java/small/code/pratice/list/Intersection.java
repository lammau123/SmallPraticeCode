package small.code.pratice.list;

/**
 * Intersection of Two Linked Lists
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Intersection {
	static public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode tmpA = headA, tmpB = headB;
		if(tmpA != null && tmpB != null) {
			while(tmpA != null || tmpB != null) {
				if(tmpA == null) {
					tmpA = headB;
				} 
				if(tmpB == null) {
					tmpB = headA;
				}
				if(tmpA == tmpB) {
					return tmpA;
				}
				
				tmpA = tmpA.next;
				tmpB = tmpB.next;
			}
		}
		return null;
    }
}
