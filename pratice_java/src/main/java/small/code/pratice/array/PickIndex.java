package small.code.pratice.array;

import java.util.Arrays;
import java.util.Random;

/**
 * Random Pick with Weight
 * 
 * Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.
 * 
 * Note:
 * 
 *     1 <= w.length <= 10000
 *     1 <= w[i] <= 10^5
 *     pickIndex will be called at most 10000 times.
 * 
 * Example 1:
 * 
 * Input: 
 * ["Solution","pickIndex"]
 * [[[1]],[]]
 * Output: [null,0]
 * 
 * Example 2:
 * 
 * Input: 
 * ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
 * [[[1,3]],[],[],[],[],[]]
 * Output: [null,0,1,1,1,0]
 * 
 * Explanation of Input Syntax:
 * 
 * The input is two lists: the subroutines called and their arguments. Solution's constructor has one argument, the array w. pickIndex has no arguments. Arguments are always wrapped with a list, even if there aren't any.
 *
 */
public class PickIndex {
	private int[] w;
	private int sum;
    
    public PickIndex(int[] w) {
        this.w = w;
        for(int weight: w) {
            sum += weight;
        }
        for(int i = 1; i < w.length; i++){
            this.w[i] += this.w[i - 1];
        }
    }
    public int pickIndex() {
    	int weight = (int) (Math.round(Math.random()*(double)sum+0.5d));
    	int index = Arrays.binarySearch(this.w, weight);
        return (index >= 0 ? index : (Math.abs(index) - 1));
    }
}
