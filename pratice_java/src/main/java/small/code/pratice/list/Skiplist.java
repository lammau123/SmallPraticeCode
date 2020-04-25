package small.code.pratice.list;

/**
 * See more about Skiplist : https://en.wikipedia.org/wiki/Skip_list
 * @author mlam21
 *
 */
class Skiplist {
	final private static int MAX_LEVEL = 4;
	private static class Node {
		public int data;
		public Node []next;
	}

	private Node skipList;
	private int skipLevel;
	
    public Skiplist() {
        this.skipLevel = 0;
        skipList = new Node();
        skipList.next = new Node[MAX_LEVEL];
    }
    
    public boolean search(int target) {
        return false;
    }
    
    public void add(int num) {
        
    }
    
    public boolean erase(int num) {
        return false;
    }
}

/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */