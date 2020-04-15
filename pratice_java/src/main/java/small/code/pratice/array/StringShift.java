package small.code.pratice.array;

public class StringShift {
	private int[] zipShift(int[][] shift) {
		for(int end = shift.length - 2; end >= 0; end--) {
			if(shift[end][0] == shift[end + 1][0]) {
				shift[end][1] += shift[end+1][1];
			} else {
				if(shift[end][1] > shift[end+1][1]) {
					shift[end][1] -= shift[end+1][1];
				} else if(shift[end][1] < shift[end+1][1]){
					shift[end][1] = shift[end+1][1] - shift[end][1];
					shift[end][0] = shift[end+1][0];
				} else {
					shift[end][1] = 0;
					end--;
				}
			}
		}
		return shift[0];
	}
	
	private String shiftLeft(String s, int num) {
		num %= s.length();
		return num == 0 ? s : s.substring(num) +  s.substring(0, num);
	}
	
	private String shiftRight(String s, int num) {
		num %= s.length();
		return shiftLeft(s, s.length() - num);
	}
	
	public String stringShift(String s, int[][] shift) {
		int[] zipShift = zipShift(shift);
        return zipShift[0] == 0 ? shiftLeft(s, zipShift[1]) : shiftRight(s, zipShift[1]);
    }
}
