package small.code.pratice.array;

import java.util.Arrays;

/**
 * Last Stone Weight
 * 
 * We have a collection of stones, each stone has a positive integer weight.
 * Each turn, we choose the two heaviest stones and smash them together. 
 * Suppose the stones have weights x and y with x <= y.  The result of this smash is:
 * 
 * If x == y, both stones are totally destroyed;
 * If x != y, the stone of weight x is totally destroyed, and the stone of weight 
 * y has new weight y-x.
 * 
 * At the end, there is at most 1 stone left.  
 * Return the weight of this stone (or 0 if there are no stones left.)
 * 
 */
public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		final int START = 0, END = stones.length-1;
        Arrays.sort(stones);
        for(int end = END - 2; end >= START; end--) {
        	if(stones[end + 1] == stones[end]) {
        		stones[end--] = 0;
        	} else {
        		stones[end] = stones[end+1]-stones[end];
        		for(int end1 = end; end1 > START && stones[end1] < stones[end1 - 1]; end1--) {
        			int tmp = stones[end1];
        			stones[end1] = stones[end1-1];
        			stones[end1-1] = tmp;
        		}
        	}
        }
        return stones[START];
    }
}
