package small.code.pratice.list;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberWays {
	private int total = 0;
	private Set<Integer> set = new HashSet<>();
	
	private void numberWays(List<List<Integer>> hats, int pos) {
		int size = set.size();
		if(set.size() >= hats.size()) {
			total++;
			return;
		}
		for (int i = 0; i < hats.get(pos).size(); i++) {
			Integer num = hats.get(pos).get(i);
			set.add(num);
			if(set.size() > size) {
				numberWays(hats, pos+1);
				set.remove(num);
				if(total >= 1000000007) {
					return;
				}
			}
		}
	}
	
	public int numberWays(List<List<Integer>> hats) {
		numberWays(hats, 0);
		return total;
    }
}
