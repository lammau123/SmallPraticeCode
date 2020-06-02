package small.code.pratice.list;

/**
 * Merge Two Sorted Lists
 * 
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 * 
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *
 */
public class MergeTwoLists {
	static private class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1 == null) return l2;
    	if(l2 == null) return l1;
    	
    	ListNode minL = null, maxL = null, head = null, tmp = null;
    	if(l1.val > l2.val) {
    		minL = l2;
    		maxL = l1;
    	} else {
    		minL = l1;
    		maxL = l2;
    	}
    	head = minL;
    	while(minL != null) {
	    	while(minL != null && minL.val <= maxL.val) {
	    		tmp = minL;
	    		minL = minL.next;
	    	}
	    	tmp.next = maxL;
	    	if(minL != null) {
		    	tmp = minL;
		    	minL = maxL;
		    	maxL = tmp;
	    	}
    	}
    	
    	return head;
    }
}
