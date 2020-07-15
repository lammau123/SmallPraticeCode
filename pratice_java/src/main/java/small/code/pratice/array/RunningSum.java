package small.code.pratice.array;

public class RunningSum {
    public int[] runningSum(int[] nums) {
    	int[] rs = new int[nums.length];
    	if(nums.length > 0) {
	    	rs[0] = nums[0];
	    	for(int i = 1; i < nums.length; i++) {
	    		rs[i] = rs[i-1] + nums[i];
	    	}
    	}
    	return rs;
    }
}
