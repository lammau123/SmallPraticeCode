package small.code.pratice.array;

import java.util.List;

public class KthSmallest {
	private int total = 0;
	private int sum = 0;
	
	public int kthSmallest(int[][] mat, int k) {
		kthSmallest(mat, 0, 0, k);
		return sum;
    }
	
	private void kthSmallest(int[][] mat, int pos, int sum, int k) {
		for (int i = 0; i < mat[pos].length; i++) {
			if(total == k) {
				return;
			} 
			int num = mat[pos][i];
			sum += num;
			if(pos >= mat.length-1) {
				if(total < k) {
					total++;
				}
				if(total == k) {
					this.sum = sum;
				} 
				sum -= num;
			} else {
				kthSmallest(mat, pos+1, sum, k);
				sum -= num;
			}
		}
	}
	
	
}
