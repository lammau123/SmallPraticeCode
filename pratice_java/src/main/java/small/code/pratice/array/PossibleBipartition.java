package small.code.pratice.array;

import java.util.ArrayList;
import java.util.List;

/**
Possible Bipartition

Given a set of N people (numbered 1, 2, ..., N), we would like to split everyone into two groups of any size.

Each person may dislike some other people, and they should not go into the same group. 

Formally, if dislikes[i] = [a, b], it means it is not allowed to put the people numbered a and b into the same group.

Return true if and only if it is possible to split everyone into two groups in this way.

 

 * Example 1:
 * 
 * Input: N = 4, dislikes = [[1,2],[1,3],[2,4]]
 * Output: true
 * Explanation: group1 [1,4], group2 [2,3]
 * 
 * Example 2:
 * 
 * Input: N = 3, dislikes = [[1,2],[1,3],[2,3]]
 * Output: false
 * 
 * Example 3:
 * 
 * Input: N = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
 * Output: false
 * 
 *  
 * 
 * Note:
 * 
 *     1 <= N <= 2000
 *     0 <= dislikes.length <= 10000
 *     1 <= dislikes[i][j] <= N
 *     dislikes[i][0] < dislikes[i][1]
 *     There does not exist i != j for which dislikes[i] == dislikes[j].
 * 
 *
 */
public class PossibleBipartition {	
	private boolean fillGroup(List<Integer>[] dislikeList, int p, int[] group, int groupId) {
		if(group[p] != 0) {
    		return group[p] == groupId;
    	} else {
    		group[p] = groupId;
    	}
		for(int index = 0; index < dislikeList[p].size(); index++) {
			int dislikePeople = dislikeList[p].get(index);
			if(!fillGroup(dislikeList, dislikePeople, group, groupId*(-1))) {
				return false;
			}
		}
		return true;
	}
	
    public boolean possibleBipartition(int N, int[][] dislikes) {
        ArrayList<Integer>[] dislikeList = new ArrayList[N+1];
        for(int i = 1; i < dislikeList.length; i++) {
        	dislikeList[i] = new ArrayList<>();
        }
        int[] group = new int[N+1];
        for(int[] dislike: dislikes) {
        	dislikeList[dislike[0]].add(dislike[1]);
        	dislikeList[dislike[1]].add(dislike[0]);
        }
        for(int people = 1; people < dislikeList.length; people++) {
        	if(group[people] == 0) {
        		if(!fillGroup(dislikeList, people, group, 1)) {
        			return false;
        		}
        	}
        }
        return true;
    }
}
