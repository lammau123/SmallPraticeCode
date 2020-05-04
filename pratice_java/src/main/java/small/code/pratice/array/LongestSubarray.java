package small.code.pratice.array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LongestSubarray {
	public int longestSubarray1(int[] nums, int limit) {
		int max = 0;
		for(int i = 0; i < nums.length; i++){
			max = Math.max(max, longestSubarray1(nums, i, limit));
		}
		return max;
	}
	public int longestSubarray1(int[] nums, int pos, int limit) {
		int max = 0;
		int start = nums[pos];
		int elements = 0;
		for(int i = pos; i < nums.length; i++) {
			int max1 = Math.abs(start - nums[i]);
			if(max1 >= max) {
				max = max1;
			}
			if(max <= limit) {
				elements = i-pos+1;
			}
		}
		return elements;
    }
	
	public int longestSubarray(int[] A, int limit) {
        Deque<Integer> maxd = new ArrayDeque<>();
        Deque<Integer> mind = new ArrayDeque<>();
        int i = 0, j;
        for (j = 0; j < A.length; ++j) {
            while (!maxd.isEmpty() && A[j] > maxd.peekLast()) maxd.pollLast();
            while (!mind.isEmpty() && A[j] < mind.peekLast()) mind.pollLast();
            maxd.add(A[j]);
            mind.add(A[j]);
            if (maxd.peek() - mind.peek() > limit) {
                if (maxd.peek() == A[i]) maxd.poll();
                if (mind.peek() == A[i]) mind.poll();
                ++i;
            }
        }
        return j - i;
    }
}