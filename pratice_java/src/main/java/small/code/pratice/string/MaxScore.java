package small.code.pratice.string;

public class MaxScore {
	public int maxScore(String s) {
        int max = 0;
        int totalOnes = 0;
        for(int at = 0; at < s.length(); at++) {
        	if(s.charAt(at) == '1') totalOnes++;
        }
        for(int at = 0, totalZeros = 0, skipOne = 0; at < s.length()-1; at++) {
        	if(s.charAt(at) == '0') totalZeros++;
        	else skipOne++;
        	max = Math.max(max, totalZeros + totalOnes - skipOne);
        }
        
        return max;
    }
}
