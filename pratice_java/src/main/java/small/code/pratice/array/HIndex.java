package small.code.pratice.array;

/**
 * H-Index II * Given an array of citations sorted in ascending order (each
 * citation is a non-negative integer) of a researcher, write a function to
 * compute the researcher's h-index.
 * 
 * According to the definition of h-index on Wikipedia: "A scientist has index h
 * if h of his/her N papers have at least h citations each, and the other N − h
 * papers have no more than h citations each."
 * 
 * Example:
 * 
 * Input: citations = [0,1,3,5,6] Output: 3 Explanation: [0,1,3,5,6] means the
 * researcher has 5 papers in total and each of them had received 0, 1, 3, 5, 6
 * citations respectively. Since the researcher has 3 papers with at least 3
 * citations each and the remaining two with no more than 3 citations each, her
 * h-index is 3.
 * 
 * Note:
 * 
 * If there are several possible values for h, the maximum one is taken as the
 * h-index.
 * 
 * Follow up:
 * 
 * This is a follow up problem to H-Index, where citations is now guaranteed to
 * be sorted in ascending order. Could you solve it in logarithmic time
 * complexity?
 */
public class HIndex {
	public int hIndex(int[] citations) {
		int left = 0, right = citations.length - 1;
		while (left <= right) {
			int med = (left + right) / 2;
			if (citations[med] == citations.length - med) {
				return citations.length - med;
			} 
			if (citations[med] < citations.length - med) {
				left = med + 1;
			} else {
				right = med - 1;
			}
		}
		return citations.length - left;
	}
	
	//unsorted order
	public int hIndex1(int[] citations) {
	    int len = citations.length;
	    int[] counter = new int[len+1];
	 
	    for(int c: citations){
	        counter[Math.min(len,c)]++;
	    }
	 
	    int k=len;
	    for(int s=counter[k]; k > s; s += counter[k]){
	        k--;
	    }
	    return k;
	}
}
