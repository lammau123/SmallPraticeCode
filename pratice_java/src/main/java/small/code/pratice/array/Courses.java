package small.code.pratice.array;

import java.util.ArrayList;

/**
 * Course Schedule
 * 
 * There are a total of numCourses courses you have to take, labeled from 0 to
 * numCourses-1.
 * 
 * Some courses may have prerequisites, for example to take course 0 you have to
 * first take course 1, which is expressed as a pair: [0,1]
 * 
 * Given the total number of courses and a list of prerequisite pairs, is it
 * possible for you to finish all courses?
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: numCourses = 2, prerequisites = [[1,0]] Output: true Explanation:
 * There are a total of 2 courses to take. To take course 1 you should have
 * finished course 0. So it is possible.
 * 
 * Example 2:
 * 
 * Input: numCourses = 2, prerequisites = [[1,0],[0,1]] Output: false
 * Explanation: There are a total of 2 courses to take. To take course 1 you
 * should have finished course 0, and to take course 0 you should also have
 * finished course 1. So it is impossible.
 * 
 * 
 * 
 * Constraints:
 * 
 * The input prerequisites is a graph represented by a list of edges, not
 * adjacency matrices. Read more about how a graph is represented. You may
 * assume that there are no duplicate edges in the input prerequisites. 1 <=
 * numCourses <= 10^5
 * 
 *
 */
public class Courses {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		ArrayList<Integer>[] requireList = new ArrayList[numCourses];
        int []graph = new int[numCourses];
        for(int[] prerequisite: prerequisites) {
        	if(requireList[prerequisite[0]] == null) {
        		requireList[prerequisite[0]] = new ArrayList<>();
        	}
        	requireList[prerequisite[0]].add(prerequisite[1]);
        }
        
        for(int i = 0; i < requireList.length; i++) {
        	if(requireList[i] != null) {
        		graph[i] = 1;
        		if(!checkCourse(i, requireList, graph)) {
        			return false;
        		}
        		graph[i] = 10; 
        	}
        }
        
        return true;
    }

	private boolean checkCourse(int course, ArrayList<Integer>[] requireList, int[] graph) {
		for (int i = 0; i < requireList[course].size(); i++) {
			int required = requireList[course].get(i);
			if (requireList[required] != null) {
				if(graph[required] == 1) {
					return false;
				} else {
					graph[required] = 1;
					if (!checkCourse(requireList[course].get(i), requireList, graph)) {
						return false;
					}
					graph[required] = 0;
				}
			}
		}

		return true;
	}
}
