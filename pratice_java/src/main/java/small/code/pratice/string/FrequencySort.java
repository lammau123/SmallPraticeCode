package small.code.pratice.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Sort Characters By Frequency
 * 
 * Given a string, sort it in decreasing order based on the frequency of characters.
 * 
 * Example 1:
 * 
 * Input:
 * "tree"
 * 
 * Output:
 * "eert"
 * 
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 * 
 * Example 2:
 * 
 * Input:
 * "cccaaa"
 * 
 * Output:
 * "cccaaa"
 * 
 * Explanation:
 * Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
 * Note that "cacaca" is incorrect, as the same characters must be together.
 * 
 * Example 3:
 * 
 * Input:
 * "Aabb"
 * 
 * Output:
 * "bbAa"
 * 
 * Explanation:
 * "bbaA" is also a valid answer, but "Aabb" is incorrect.
 * Note that 'A' and 'a' are treated as two different characters.
 * 
 *
 */
public class FrequencySort {
	private static class Frequency implements Comparable<Frequency>{
		private char c;
		private int count;
		public Frequency(char c){
			this.c = c;
			this.count = 0;
		}
		public char getC() {return c;}
		public int getCount() {return count;}
		public Frequency increaseCount() {count++; return this;}
		@Override
		public int compareTo(Frequency o) {
			if(this.getCount() > o.getCount()) {
				return 1;
			} 
			if(this.getCount() < o.getCount()) {
				return -1;
			}
			return 0;
		}
		public String toString() {
			StringBuilder builder = new StringBuilder();
			for(int i = 0; i < getCount(); i++) {
				builder.append(getC());
			}
			return builder.toString();
		}
	}
	
    public String frequencySort(String s) {
    	Map<Character, Frequency> map = new HashMap<>();
    	for(char c: s.toCharArray()) {
    		map.put(c, map.getOrDefault(c, new Frequency(c)).increaseCount());
    	}
    	Frequency[] fr = map.values().toArray(new Frequency[0]);
    	Arrays.sort(fr);
    	StringBuilder builder = new StringBuilder();
    	for(int end = fr.length-1; end >= 0; end--) {
    		builder.append(fr[end].toString());
    	}
    	return builder.toString();
    }
}
