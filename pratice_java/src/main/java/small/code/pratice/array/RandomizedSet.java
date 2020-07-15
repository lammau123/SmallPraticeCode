package small.code.pratice.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {
	private List<Integer> list = new ArrayList<>();
	private Map<Integer, Integer> hashSet = new HashMap<>();
    /** Initialize your data structure here. */
    public RandomizedSet() {     
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hashSet.containsKey(val)) return false;
        hashSet.put(val, list.size());
        list.add(val);
        return true;
    }
  
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!hashSet.containsKey(val)) return false;
        Integer index = hashSet.remove(val);
        if(index != list.size()-1) {
        	list.set(index, list.remove(list.size()-1));
        	hashSet.put(list.get(index), index);
        } else {
        	list.remove(list.size()-1);
        }
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
    	if(list.isEmpty()) return -1;
        int index = new Random().nextInt(list.size());
        return list.get(index);
    }
}
