package small.code.pratice.array;

public class FindBestValue {
	public int findBestValue(int[] arr, int target) {
        int sum = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        if (sum == target) return max;
        int min = 0, res = max,diff = Math.abs(sum - target);
        // The answer would lie between 0 and maximum value in the array.
        while (min <= max) {
            int mid = min + (max - min) / 2;
            sum = getMutatedSum(arr, mid); 
            if (sum > target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
            int curDiff = Math.abs(sum - target);
            // If current difference is less than diff || current difference==diff but mid < res.(choose the smaller one.)
            if (curDiff < diff || (curDiff == diff && mid < res)) { 
                res = mid;
                diff = curDiff;
            }
        }
        return res;
    }

    private int getMutatedSum(int[] arr, int mid) {
        int sum = 0;
        for (int a : arr) {
            sum += (a > mid) ? mid : a;
        }
        return sum;
    }
}
