package small.code.pratice.list;

/**
 * Design Linked List
 * 
 * Design your implementation of the linked list. You can choose to use the singly linked list
 *  or the doubly linked list. A node in a singly linked list should have two attributes: 
 *  val and next. val is the value of the current node, and next is a pointer/reference to 
 *  the next node. If you want to use the doubly linked list, you will need one more attribute
 *  prev to indicate the previous node in the linked list. Assume all nodes in the linked 
 *  list are 0-indexed.
 *  
 *  Implement these functions in your linked list class:
 *  
 *  get(index) : Get the value of the index-th node in the linked list. If the index is invalid, return -1.
 *  addAtHead(val) : Add a node of value val before the first element of the linked list. 
 *  After the insertion, the new node will be the first node of the linked list.
 *  addAtTail(val) : Append a node of value val to the last element of the linked list.
 *  addAtIndex(index, val) : Add a node of value val before the index-th node in the linked list. 
 *  If index equals to the length of linked list, the node will be appended to the end of linked 
 *  list. If index is greater than the length, the node will not be inserted.
 *  deleteAtIndex(index) : Delete the index-th node in the linked list, if the index is valid.
 *  
 *  Example:
 *  
 *  Input: 
 *  ["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
 *  [[],[1],[3],[1,2],[1],[1],[1]]
 *  Output:  
 *  [null,null,null,null,2,null,3]
 *  
 *  Explanation:
 *  MyLinkedList linkedList = new MyLinkedList(); // Initialize empty LinkedList
 *  linkedList.addAtHead(1);
 *  linkedList.addAtTail(3);
 *  linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
 *  linkedList.get(1);            // returns 2
 *  linkedList.deleteAtIndex(1);  // now the linked list is 1->3
 *  linkedList.get(1);            // returns 3
 *  
 *  Constraints:
 *  
 *  0 <= index,val <= 1000
 *  Please do not use the built-in LinkedList library.
 *  At most 2000 calls will be made to get, addAtHead, addAtTail,  addAtIndex and deleteAtIndex.
 *
 */
class MyLinkedList {
	
	private static class Node{
		public int data;
		public Node next;
		
		Node(int val, Node next){
			this.data = val;
			this.next = next;
		}
	};
	
	private Node head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
    	head = null;
    }
    
    private Node getNodeAt(int index) {
    	Node tmp = head;
    	for(int start = 1; start <= index && tmp != null; start++) {
    		tmp = tmp.next;
    	}
    	return tmp;
    }
    
    private int getLength() {
    	int count = head == null ? 0 : 1;
    	Node tmp = head;
    	while(tmp != null && tmp.next != null) {
    		tmp = tmp.next;
    		count++;
    	}
    	return count;
    }
    /** Get the value of the index-th node in the linked list. 
     * If the index is invalid, return -1. 
     */
    public int get(int index) {
        Node tmp = getNodeAt(index);
        return tmp == null ? -1 : tmp.data;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	head = new Node(val, head);
    }
   
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(head == null) {
        	addAtHead(val);
        } else {
        	Node tmp = head;
        	while(tmp != null && tmp.next != null) {
        		tmp = tmp.next;
        	}
        	tmp.next = new Node(val, null);
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. 
     * If index equals to the length of linked list, the node will be appended to the
     * end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
    	if(index >= 0 && index <= getLength()) {
    		if(index == 0) {
    			addAtHead(val);
    		} else {
    			Node tmp = getNodeAt(index-1);
    			if(tmp == null) {
    				addAtTail(val);
    			} else {
    				tmp.next = new Node(val, tmp.next);
    			}
    			
    		}
    	}
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
    	if(head != null && index >= 0 && index < getLength()){
	    	if(index == 0) {
	    		head = head.next;
	    	} else {
	    		Node tmp = getNodeAt(index-1);
	    		tmp.next = tmp.next.next;
	    	}
    	}
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */