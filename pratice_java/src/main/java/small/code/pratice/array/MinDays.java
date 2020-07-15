package small.code.pratice.array;

public class MinDays {
    public int minDays(int[] bloomDay, int m, int k) {
    	if(bloomDay.length == 0 && m == 0 && k == 0) return 0;
    	if(m*k > bloomDay.length) return -1;
    	int minDay = bloomDay[0], maxDay = bloomDay[0];
      	for(int i = 1; i < bloomDay.length; i++) {
    		minDay = Math.min(minDay, bloomDay[i]);
    		maxDay = Math.max(maxDay, bloomDay[i]);
    	}
    	int left = 0, right=maxDay;
    	while(left <= right) {
    		int mid = left+ (right-left)/2;
    		if(isValid(bloomDay, m, k, mid)) {
    			right = mid-1;
    		} else {
    			left = mid+1;
    		}
    	}
    	
    	return left;
    }
    
    private boolean isValid(int[] bloomDay, int m, int k, int mid) {
    	int bouquets = 0, flowers = 0;
    	for(int i = 0; i < bloomDay.length; i++) {
    		flowers = bloomDay[i] <= mid ? flowers + 1 : 0;
    		if(flowers == k) {
    			flowers = 0;
    			bouquets++;
    			if(bouquets == m) return true;
    		}
    	}
    	
    	return false;
    }
}
