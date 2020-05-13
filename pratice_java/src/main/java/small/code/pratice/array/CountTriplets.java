package small.code.pratice.array;

public class CountTriplets {
	public int countTriplets(int[] arr) {
    	int count=0;
        for(int i = 0; i < arr.length - 1; i++) {
        	int a = 0;
        	for(int j = i+1; j < arr.length; j++) {
        		a ^= arr[j-1];
        		int b = 0;
        		for(int k = j; k < arr.length; k++) {
        			b ^= arr[k];
            		if(b == a) {
            			count++;
            		}
        		}
        	}
        }
        return count;
    }
}
