package small.code.pratice.array;

import java.util.Arrays;

/**
 * Queue Reconstruction by Height
 * 
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.
 * 
 * Note:
 * The number of people is less than 1,100.
 *  
 * 
 * Example
 * 
 * Input:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 * 
 * Output:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 *
 */
public class ReconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
    	Arrays.sort(people, (a1, a2) -> a1[0] == a2[0] ? a1[1] - a2[1] : a2[0] - a1[0]);
        int[][] rs = new int[people.length][];
        for(int[] person: people) {
        	insert(rs, person[1], person);
        }
        return rs;
    }

	private void insert(int[][] queue, int pos, int[] person) {
    	int[] insertPerson = person;
    	while(queue[pos] != null) {
    		int[] tmp = queue[pos];
    		queue[pos] = insertPerson;
    		insertPerson = tmp;
    		pos++;
    	}
    	queue[pos] = insertPerson;
    }
}
