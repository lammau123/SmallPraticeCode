package small.code.pratice.list;

/**
 * Copy List with Random Pointer
 * 
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 * 
 * Return a deep copy of the list.
 * 
 * The Linked List is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
 * 
 *     val: an integer representing Node.val
 *     random_index: the index of the node (range from 0 to n-1) where random pointer points to, or null if it does not point to any node.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 
 * Example 2:
 * 
 * Input: head = [[1,1],[2,1]]
 * Output: [[1,1],[2,1]]
 * 
 * Example 3:
 * 
 * Input: head = [[3,null],[3,0],[3,null]]
 * Output: [[3,null],[3,0],[3,null]]
 * 
 * Example 4:
 * 
 * Input: head = []
 * Output: []
 * Explanation: Given linked list is empty (null pointer), so return null.
 * 
 *  
 * 
 * Constraints:
 * 
 *     -10000 <= Node.val <= 10000
 *     Node.random is null or pointing to a node in the linked list.
 *     Number of Nodes will not exceed 1000.
 * 
 *
 */
public class CopyRandomList {
    public Node copyRandomList(Node head) {
        Node tmp = head;
        
        while(tmp != null) {
        	Node tmpNext = tmp.next;
        	tmp.next = new Node(tmp.val);
        	tmp.next.next = tmpNext;
        	tmp = tmpNext;
        }
        
        tmp = head;
        Node copyHead = head == null ? head: head.next;
        while(tmp != null && tmp.next != null) {
        	Node copyTmp = tmp.next;
        	copyTmp.random = (tmp.random != null ? tmp.random.next : null);
        	tmp = copyTmp.next;
        }
        
        tmp = head;  
        Node copyTmp = (tmp == null ? null : tmp.next);
        while(tmp != null && tmp.next != null) {
        	tmp.next = copyTmp.next;
        	if(tmp.next != null) {
        		tmp = tmp.next;
            	copyTmp.next = tmp.next;
            	copyTmp = copyTmp.next;
        	}
        }
        
        return copyHead;
    }
}
