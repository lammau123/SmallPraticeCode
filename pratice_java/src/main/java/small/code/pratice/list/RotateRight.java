package small.code.pratice.list;

/**
 * Rotate List
 * 
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.
 * 
 * Example 1:
 * 
 * Input: 1->2->3->4->5->NULL, k = 2
 * Output: 4->5->1->2->3->NULL
 * Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 * 
 * Example 2:
 * 
 * Input: 0->1->2->NULL, k = 4
 * Output: 2->0->1->NULL
 * Explanation:
 * rotate 1 steps to the right: 2->0->1->NULL
 * rotate 2 steps to the right: 1->2->0->NULL
 * rotate 3 steps to the right: 0->1->2->NULL
 * rotate 4 steps to the right: 2->0->1->NULL
 *
 */
public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode kStep = head;
        int kTmp = k;
        if(kStep != null) {
	        while(kTmp > 0 && kStep != null) {
	        	kStep = kStep.next;
	        	kTmp--;
	        }
	        if(kStep == null) {
	        	kTmp = k%(k - kTmp);
	        	kStep = head;
	        	while(kTmp > 0) {
	            	kStep = kStep.next;
	            	kTmp--;
	            }
	        }
	        ListNode tmp = head;
	        while(kStep.next != null) {
	        	tmp = tmp.next;
	        	kStep = kStep.next;
	        }
	        kStep.next = head;
	        head = tmp.next;
	        tmp.next = null;
        }
        return head;
    }
}
