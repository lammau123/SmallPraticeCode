package small.code.pratice.array;

public class MaxScore {
	public int maxScore(int[] cardPoints, int k) {
		int sum[] = new int[cardPoints.length+1];
		for(int start = 0; start < k; start++) {
			sum[0] += cardPoints[start];
		}
		int max = sum[0];
		for(int end = 1, begin = k - 1; end <= k; end++, begin--) {
			sum[end] = sum[end-1] - cardPoints[begin] + cardPoints[cardPoints.length - end];
			max = Math.max(max, sum[end]);
		}
		return max;
	}
}
