package small.code.pratice.list;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class PeopleIndexes {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for(int i = 0; i < favoriteCompanies.size(); i++) {
        	Set<String> set = favoriteCompanies.get(i).stream().collect(Collectors.toSet());
        	boolean subset = false;
        	for(Iterator<Map.Entry<Integer, Set<String>>> it = map.entrySet().iterator(); it.hasNext(); ) {
        		Map.Entry<Integer, Set<String>> setCom = it.next();
        		if(setCom.getValue().size() >= set.size()) {
        			if(setCom.getValue().containsAll(set)) {
        				subset = true;
        			}
        		} else {
        			if(set.containsAll(setCom.getValue())) {
        				it.remove();
        			}
        		}
        	}
        	if(!subset) {
        		map.put(i, set);
        	}
        }
        
        return map.keySet().stream().sorted().collect(Collectors.toList());
    }
}
