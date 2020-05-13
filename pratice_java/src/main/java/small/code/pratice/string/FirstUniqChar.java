package small.code.pratice.string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * First Unique Character in a String
 * 
 * Given a string, find the first non-repeating character in it and return it's 
 * index. If it doesn't exist, return -1.
 * 
 * Examples:
 * 
 * s = "leetcode"
 * return 0.
 * 
 * s = "loveleetcode",
 * return 2.
 * 
 * Note: You may assume the string contain only lowercase letters. 
 *
 */
public class FirstUniqChar {
	public int firstUniqChar(String s) {
        Map<Character, Integer> queue = new LinkedHashMap<>();
        Set<Character> set = new HashSet<>();
        char[] chs = s.toCharArray();
        for(int index = 0; index < chs.length; index++) {
        	if(!set.contains(chs[index])) {
        		set.add(chs[index]);
        		queue.put(chs[index], index);
        	} else {
        		queue.remove(chs[index]);
        	}
        }
        Iterator<Character> iter = queue.keySet().iterator();
        return iter.hasNext() ? queue.get(iter.next()) : -1; 
    }
}
