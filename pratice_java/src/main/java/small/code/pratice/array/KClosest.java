package small.code.pratice.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KClosest {
    public int[][] kClosest(int[][] points, int K) {
    	Map<Integer, List<int[]>> map = new HashMap<Integer, List<int[]>>();
        for(int []point: points) {
        	Integer dis = distance(point);
        	if(!map.containsKey(dis)) {
        		map.put(dis, new ArrayList<>());
        	}
        	map.get(dis).add(point);
        }
        Integer[] keys = map.keySet().toArray(new Integer[0]);
        Arrays.sort(keys);
        List<int[]> lst = new ArrayList<>();
        for(Integer key: keys) {
        	List<int[]> point = map.get(key);
        	for(int i = 0; i < point.size(); i++) {
        		lst.add(point.get(i));
        	}
        	if(lst.size() >= K) break;
        }
        return lst.toArray(new int[K][]);
    }

	private Integer distance(int[] point) {
		return point[0]*point[0] + point[1]*point[1];
	}
}
