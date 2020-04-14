package small.code.pratice.array;

import java.util.stream.IntStream;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int[] rs = new int[digits.length];
		int mem = 0, inc = 1;
		for(int end = digits.length - 1; end >= 0; end--) {
			int tmp = digits[end] + mem + inc;
			inc = 0;
			mem = tmp/10;
			rs[end] = tmp%10;
		}
		return mem <= 0 ? rs : IntStream.concat(IntStream.of(mem), IntStream.of(rs)).toArray();
    }
}
