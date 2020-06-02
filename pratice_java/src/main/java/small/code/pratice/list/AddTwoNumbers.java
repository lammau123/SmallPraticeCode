package small.code.pratice.list;

/**
 * Add Two Numbers
 * 
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Example:
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 */
public class AddTwoNumbers {
	static private class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null, tmp1 = null;
        int carry = 0;
        while(l1 != null && l2 != null) {
        	int tmp = l1.val + l2.val + carry;
        	carry = tmp/10;
        	tmp %= 10;
        	if(res == null) {
        		res = new ListNode(tmp);
        		tmp1 = res;
        	} else {
        		tmp1.next = new ListNode(tmp);
        		tmp1 = tmp1.next;
        	}
        	l1 = l1.next;
        	l2 = l2.next;
        }
        
        tmp1 = l1 == null ? l2 : l1;
        
        while(tmp1 != null){
        	int tmp = tmp1.val + carry;
        	carry = tmp/10;
        	tmp1.next = new ListNode(tmp%10);
        	tmp1 = tmp1.next;
        }
        
        if(carry > 0) {
        	tmp1.next = new ListNode(carry);
        }
        return res;
    }
}
