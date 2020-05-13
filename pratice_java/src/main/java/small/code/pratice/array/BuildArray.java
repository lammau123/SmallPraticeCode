package small.code.pratice.array;

import java.util.ArrayList;
import java.util.List;

public class BuildArray {
    public List<String> buildArray(int[] target, int n) {
    	List<String> rs = new ArrayList<>();
    	for(int from = 1, start = 0; from <= n; from++) {
    		if(target[start] == from) {
    			rs.add("Push");
    			start++;
    			if(start >= target.length) {
    				break;
    			}
    		} else {
    			rs.add("Push");
    			rs.add("Pop");
    		}
    	}
    	
    	return rs;
    }
}
