package small.code.pratice.array;

import java.util.stream.IntStream;

public class FindNumbers {
	private static final int ONE = 1;
	private int countDigits(int num) {
		if(num == 0) return 0;
		return 1 + countDigits(num/10);
	}
	public int findNumbers(int[] nums) {
        int rs = (int) IntStream.of(nums).filter(num -> (countDigits(num) & ONE) == 0).count();
        return rs;
    }
}
