package small.code.pratice.array;

public class Prices {
    public int[] finalPrices(int[] prices) {
    	int[] rs = new int[prices.length];
        int j = 1, index = 0;
        for(int i = 0; i < prices.length; i++) {
        	if((i > 0 && prices[i-1] < prices[i]) || j == i) {
        		j = i+1;
        	} 
        	while(j < prices.length && prices[j] > prices[i]) j++;
        	if(j >= prices.length) {
        		rs[index++] = prices[i];
        	} else {
        		rs[index++] = prices[i] - prices[j];;
        	}
        }
        return rs;
    }
}
