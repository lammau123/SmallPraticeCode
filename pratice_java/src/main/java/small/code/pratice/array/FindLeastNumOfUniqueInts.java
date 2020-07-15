package small.code.pratice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindLeastNumOfUniqueInts {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int v: arr) {
    		map.put(v, map.getOrDefault(v, 0) + 1);
    	}
    	Integer[] values = map.values().toArray(new Integer[0]);    
    	Arrays.sort(values);
    	int count = 0;
    	for(int v: values) {
    		if(k >= v) {
    			k -= v;
    		} else {
    			count++;
    		}
    	}
    	
    	return count;
    }
}
