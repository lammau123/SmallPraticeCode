package small.code.pratice.list;

/**
 * See more about Skiplist : https://en.wikipedia.org/wiki/Skip_list
 * @author mlam21
 *
 */
class Skiplist1 {
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
		
		public void add(Node node) {
			int level = node.next.length > next.length ? next.length - 1: node.next.length - 1;
			while(level >= 0 && (next[level] == null || next[level].data > node.data)) {
				node.next[level] = next[level];
				next[level] = node;
				level--;
			}
			if(level >= 0) {
				next[level].add(node);
			}
		}
		
		public boolean erase(int target) {
			boolean found = false;
			int level = next.length - 1;
			while(level >= 0 && (next[level] == null || next[level].data > target)) {
				level--;
			}
			
			while(level >= 0 && target == next[level].data) {
				next[level] = next[level].next[level];
				level--;
				found = true;
			}
			
			if(level >= 0) {
				return next[level].erase(target);
			}
			
			return found;
		}
		
		public Node search(int target) {
			int level = next.length-1;
			while(level >= 0 && (next[level] == null || next[level].data > target)) {
				level--;
			}
				
			if(level >= 0) {
				if(next[level].data == target) {
					return next[level];
				} else {
					return next[level].search(target);
				}
			}
			return null;
		}
	}

	private Node head;
	
    public Skiplist1() {
        head = create(MAX_LEVEL, 0);
    }
    
    private Node create(int level, int data) {
    	return new Node(level, data);
    }
    
    private int generateLevel(int max) {
    	return (int) (Math.random()*max)+1;
    }
	
	public boolean search(int target) {
    	return head.search(target) != null;
    }
	
    public void add(int num) {
    	Node node = create(generateLevel(MAX_LEVEL), num);
    	head.add(node);
    }
    
    public void add(int num, int level) {
    	Node node = create(level, num);
    	head.add(node);
    }
    
    public boolean erase(int num) {
    	return head.erase(num);
    }
}

/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */