package small.code.pratice.array;

public class ProductExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int[] rs = new int[nums.length];
		rs[0] = 1;
		for(int start = 1; start < nums.length; start++) {
			rs[start] = nums[start - 1]*rs[start - 1];
		}
		for(int mul = nums[nums.length - 1], end = rs.length - 2; end >= 0; end--) {
			rs[end] *= mul;
			mul *= nums[end];
		}
        return rs;
    }
}
