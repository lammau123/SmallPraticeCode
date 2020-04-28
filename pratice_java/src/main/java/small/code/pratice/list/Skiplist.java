package small.code.pratice.list;

/**
 * See more about Skiplist : https://en.wikipedia.org/wiki/Skip_list
 * @author mlam21
 *
 */
class Skiplist {
	final private static int MAX_LEVEL = 4;
	private static class Node {
		private int data;
		private Node []next;
		
		public Node(int level){
	        this.next = new Node[level];
		}
		
		public Node(int level, int data){
	        this(level);
	        this.data = data;
		}
	}

	private Node head;
	private int skipLevel;
	
    public Skiplist() {
        this.skipLevel = 0;
        head = create(MAX_LEVEL, 0);
    }
    
    private Node create(int level, int data) {
    	return new Node(level, data);
    }
    
    private int generateLevel(int max) {
    	return (int) (Math.random()*max)+1;
    }
    
	private Node[] searchNode(int num) {
		Node[] nodes = new Node[MAX_LEVEL];
		Node tmp = head;
		for (int level = skipLevel; level >= 0; level--) {
			while (tmp.next[level] != null && tmp.next[level].data < num) {
				tmp = tmp.next[level];
			}
			nodes[level] = tmp;
		}
		return nodes;
	}
	
	public boolean search(int target) {
    	Node[] updatedList = searchNode(target);
   	    return (updatedList[0].next[0] != null && target == updatedList[0].next[0].data);
    }
	
    public void add(int num) {
    	 Node[] updatedList = searchNode(num);
    	 if(updatedList[0].next[0] != null && num == updatedList[0].next[0].data) {
    		 return;
    	 }
    	 Node node = create(generateLevel(MAX_LEVEL), num);
    	 int newLevel = node.next.length - 1;
    	 if(newLevel > skipLevel) {
    		 for(int level = skipLevel+1; level <= newLevel; level++) {
    			 updatedList[level] = head;
    		 }
    		 skipLevel = newLevel;
    	 }  
    	 for(int level = 0; level <= newLevel; level++) {
    		 node.next[level] = updatedList[level].next[level];
    		 updatedList[level].next[level] = node;
    	 }
    }
    
    public boolean erase(int num) {
    	Node[] updatedList = searchNode(num);
    	if (updatedList[0].next[0] != null && num != updatedList[0].next[0].data) {
    		return false;
    	}
    	for(int level = 0; level < updatedList.length; level++) {
    		if (updatedList[level] == null || updatedList[level].next[level] == null) 
    			break;
    		updatedList[level].next[level] = updatedList[level].next[level].next[level];
   	    }
    	
    	return true;
    }
}

/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */