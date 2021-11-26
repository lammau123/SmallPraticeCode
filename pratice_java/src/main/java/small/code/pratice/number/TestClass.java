package small.code.pratice.number;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int T = Integer.parseInt(s.nextLine().trim());
        String[] data = null;
        while(T > 0){
            data = split(s.nextLine(), " ");
            int N = Integer.parseInt(data[0]);
            int K = Integer.parseInt(data[1]);
            String chars = s.nextLine();
            System.out.println(solved(substring(chars.trim(), N), K));
            T--;
        }
        s.close();
    }

    private static String substring(String chars, int N) {
    	int len = Math.min(chars.length(), N);
    	StringBuilder s = new StringBuilder(chars.substring(0, len));
    	while(len < N) {
    		s.append('0');
    		len++;
    	}
    	return s.toString();
    }
    
    private static String[] split(String s, String pattern){
        StringTokenizer tokens = new StringTokenizer(s, pattern);
        String[] splited = new String[tokens.countTokens()];
        int index = 0;
        while(tokens.hasMoreTokens()){
            splited[index] = tokens.nextToken();
            ++index;
        }
        return splited;
    }
    
    private static long solved(String chars, int K){
    	char[] digits = new char[chars.length()];
    	int[] counts = new int[chars.length()];
    	int len = zip(chars, digits, counts);       
    	if(len == 1) {
    		return K-1;
    	}
    	long cycle = 0, sum = 0;
    	int k = 1;
    	List<Long> map = new ArrayList<>();
    	int headBIndex = findB(digits, counts, len, map);
    	if(k >= K) return map.get(0);
    	int currentBIndex = headBIndex;
    	do {
    		int nextBIndex = nextNextCycle(digits, len, currentBIndex);
    		cycle += countCycle(counts, len, currentBIndex, nextBIndex);
    		if(nextBIndex == headBIndex || compare(digits, counts, len, headBIndex, nextBIndex) == 0) {
    			map.add(cycle);
    			sum += cycle;
    			cycle = 0;
    			k++;
    		}
    		currentBIndex = nextBIndex;
    	} while(k < K && currentBIndex != headBIndex);
    	if(k < K) {
    		sum = calculateCycle(map, sum, K-k, k-1);
    	}
    	
    	return sum + map.get(0);
    }
    
    private static long calculateCycle(List<Long> map, long sum, int remain, int totalCycle) {
    	sum = sum*(long)(remain/totalCycle) + sum;
		for(int i = remain%totalCycle; i > 0; i--) {
			sum += map.get(i);
		}
		return sum;
	}

	private static long countCycle(int[] counts, int len, int currentBIndex, int nextBIndex) {
		long cycle = 0;
		if(currentBIndex < nextBIndex) {
			cycle += countCycle(counts, currentBIndex, nextBIndex);
		} else {
			cycle += countCycle(counts, currentBIndex, len);
			cycle += countCycle(counts, 0, nextBIndex);
		}
		return cycle;
	}

	private static long countCycle(int[] counts, int from, int to) {
		long cycle = 0;
		for(int i = from; i < to; i++) {
			cycle += (long)counts[i];
		}
		return cycle;
	}

	private static int zip(String chars, char[] digits, int[] counts) {
    	int len = 0;
    	for(int i = 0; i < chars.length(); len++) {
    		digits[len] = chars.charAt(i);
    		counts[len] = count(chars, i);
    		i += counts[len];
    	}
    	return len;
    }
    
    private static int nextNextCycle(char[] digits, int len, int at) {
    	return nextCycle(digits, len, nextCycle(digits, len, at));
    }
    
    private static int nextCycle(char[] digits, int len, int at) {
    	at++;
		if(at >= len) {
			at = 0;
			if(digits[at] == digits[len-1]) {
				at++;
			}
		}
		
		return at;
    }
    
    private static int findB(char[] digits, int[] counts, int len, List<Long> map) {
        int maxIndex = -1;
        int i = 0;
        int steps = 0;
        int maxStep = 0;
        for(; i < len; i++){
        	steps += counts[i];
            if(digits[i] == '1'){
                if(maxIndex == -1 || counts[i] > counts[maxIndex]){
                    maxIndex = i;
                    maxStep = steps;
                } else if(counts[i] == counts[maxIndex]) {
                	if(compare(digits, counts, len, i, maxIndex) > 0) {
                		maxIndex = i;
                		maxStep = steps;
                	}
                }
            }
        }
        
        if(maxIndex != len-1 && digits[len-1] == '1' && digits[0] == '1'){
        	if(counts[0] + counts[len-1] > counts[maxIndex]) {
        		maxIndex = i-1;
        		maxStep = steps;
        	} else if(counts[0] + counts[len-1] == counts[maxIndex]) {
        		if(compare(digits, counts, len, len-1, maxIndex) > 0) {
            		maxIndex = len-1;
            		maxStep = steps;
            	}
        	}
        }
        map.add((long) (maxStep - counts[maxIndex]));
        return maxIndex;
	}

	private static int compare(char[] digits, int[] counts, int len, int index1, int index2) {
		int i1 = index1, i2 = index2;
        while(i2 < len){
        	int r = compare(digits[i1], getCount(digits, counts, len, i1), digits[i2], getCount(digits, counts, len, i2));
            if(r != 0) {
            	return r;
            } 
            i2++;
            i1 = nextCycle(digits, len, i1);
        }
        i2 = nextCycle(digits, len, i2);
        while(i2 < index2){
        	int r = compare(digits[i1], getCount(digits, counts, len, i1), digits[i2], getCount(digits, counts, len, i2));
            if(r != 0) {
            	return r;
            } 
            i1 = nextCycle(digits, len, i1);
            i2++;
        }
        return 0;
	}
	
	private static int compare(char c1, int count1, char c2, int count2) {
		if(c1 < c2){
            return -1;
        } 
		if(c1 > c2){
        	return 1;
        } 
		if(c1 == '1') {
			return count1 < count2 ? -1 : count1 > count2 ? 1 : 0;
        }	
		return count1 < count2 ? 1 : count1 > count2 ? -1 : 0;
	}
	
	private static int getCount(char[] digits, int[] counts, int len, int at) {
		if(at == len - 1 && digits[at] == digits[0]) {
			return counts[at] + counts[0];
		}
		return counts[at];
	}

	private static int count(String chars, int at) {
    	int count = 1;
    	char ch = chars.charAt(at++);
    	while(at < chars.length() && chars.charAt(at++) == ch) {
    		count++;
    	}
    	return count;
    }    
}

/*
 * 1
20 50
11001101101110011101
*/