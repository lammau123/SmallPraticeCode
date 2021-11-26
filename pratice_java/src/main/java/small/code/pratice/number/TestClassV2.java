package small.code.pratice.number;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClassV2 {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int T = Integer.parseInt(s.nextLine().trim());
        String[] data = null;
        while(T > 0){
            data = split(s.nextLine(), " ");
            int N = Integer.parseInt(data[0]);
            int K = Integer.parseInt(data[1]);
            String chars = s.nextLine();
            System.out.println(solved(substring(chars, N), K));
            T--;
        }
        s.close();
    }
 
    private static String substring(String chars, int N) {
    	int len = Math.min(chars.length(), N);
    	StringBuilder s = new StringBuilder(chars.substring(0, len));
    	while(len < N) {
    		s.append('0');
    		len++;
    	}
    	return s.toString();
    }
    
    private static String[] split(String s, String pattern){
        StringTokenizer tokens = new StringTokenizer(s, pattern);
        String[] splited = new String[tokens.countTokens()];
        int index = 0;
        while(tokens.hasMoreTokens()){
            splited[index] = tokens.nextToken();
            ++index;
        }
        return splited;
    }
    
    private static long solved(String chars, int K){
    	List<Long> cycles = new ArrayList<Long>();
    	Node tail = toLinkedNode(chars);
    	if(tail.next() == tail) return K-1;
    	long steps = groupHeadTail(tail);
    	Node bHead = findB(tail.next(), cycles);
    	Node next = bHead;
    	int k = 1;
    	long cycle = 0, sum = 0;
    	while(k < K) {
    		cycle += next.getCount();
    		next = next.next();
    		if(compare(bHead, next) == 0) {
    			cycles.add(cycle);
    			sum += cycle;
    			cycle = 0;
    			k++;
    		}
    		if(next == bHead) break;
    	}
    	if(k < K) {
    		sum = calculateCycle(cycles, sum, K-k, k-1);
    	}
    	return sum + cycles.get(0) + steps;
    }
    
    private static long groupHeadTail(Node tail) {
		long cycles = 0; 
     	if(tail.next() != tail && tail.next().getBit() == tail.getBit()) {
    		cycles = (long)tail.next().getCount();
			tail.setCount(tail.getCount() + tail.next().getCount());
			tail.setNext(tail.next().next());
		}
    	return cycles;
	}

	private static Node findB(Node head, List<Long> cycles) {
		Node bHead = head;
		long bCycle = 0; 
		Node next = bHead;
		long nextCycle = 0;
		while(next.next() != head) {
			int r = compare(next.next(), bHead);
			if(r > 0) {
				nextCycle += next.getCount();
				bHead = next.next();
				bCycle = nextCycle;
			} else {
				nextCycle += next.getCount();
			}
			next = next.next();			
		}
		cycles.add(bCycle);
		return bHead;
	}

	private static int compare(Node next, Node bHead) {
		Node p1 = next;
		Node p2 = bHead;
		int r = 0;
		
		while(p2.next() != bHead) {
			boolean b = p2.getBit() == p1.getBit();
			if(b) {
				boolean c = p2.getCount() == p1.getCount();
				if(c) {
					p1 = p1.next();
					p2 = p2.next();
				} else if(p1.getBit() == '1') {
					r = p1.getCount() > p2.getCount() ? 1 : -1;
				} else {
					r = p1.getCount() > p2.getCount() ? -1 : 1;
				}
			} else {
				r = p1.getBit() == '1' ? 1 : -1;
			}
			if(r != 0) break;
		}
		
		return r;
	}

	private static Node toLinkedNode(String chars) {
    	Node tail = null;
		char bit = chars.charAt(0);
		int count = 1;
		for(int i = 1; i < chars.length(); i++) {
			char nextBit = chars.charAt(i);
			if(bit == nextBit) {
				count++;
			} else {
				Node node = new Node(bit, count); 
				if(tail == null) {
					tail = node;
					tail.next = tail;
				} else {
					node.next = tail.next;
					tail.next = node;
					tail = node;
				}
				bit = nextBit;
				count = 1;
			}
		}
		Node node = new Node(bit, count); 
		if(tail == null) {
			tail = node;
			tail.next = tail;
		} else {
			node.next = tail.next;
			tail.next = node;
			tail = node;
		}
		return tail;
	}

    private static long calculateCycle(List<Long> map, long sum, int remain, int totalCycle) {
    	sum = sum*(long)(remain/totalCycle) + sum;
		for(int i = remain%totalCycle; i > 0; i--) {
			sum += map.get(i);
		}
		return sum;
	}
    
	private static class Node{
		private int count;
		private char bit;
		private Node next;
		
		public Node(char bit, int count) {
			this.count = count;
			this.bit = bit;
			this.next = null;
		}
		
		public char getBit() {
			return bit;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public Node next() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
}
 