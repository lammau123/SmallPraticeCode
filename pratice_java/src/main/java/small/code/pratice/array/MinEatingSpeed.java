package small.code.pratice.array;

public class MinEatingSpeed {
    public int minEatingSpeed(int[] piles, int H) {
        int min = 1, max = 1000000000;
        while(min <= max) {
        	int mid = min + (max-min)/2;
        	int h = eat(piles, mid, H);
        	if(h >= 0) {
        		max = mid-1;
        	} else {
        		min = mid+1;
        	}
        }
        return min;
    }
    
    private int eat(int[] piles, int K, int H) {
    	for(int pile: piles) {
    		H -= pile/K;
    		if(pile%K > 0) {
    			H--;
    		}
    	}
    	
    	return H;
    }
}
