package small.code.pratice.array;

public class MinSumOfLengths {
	public int minSumOfLengths(int[] arr, int target) {
		int start = 0, min1 = 0, min2 = 0, sum = 0, count = 0;
		for(int i = 0; i < arr.length; i++) {
			start = i;
			while (start < arr.length) {
				sum += arr[start++];
				count++;
				if (sum == target) {
					if (min2 == 0) {
						min2 = count;
					} else {
						if (min1 == 0) {
							if (min2 >= count) {
								min1 = count;
							} else {
								min1 = min2;
								min2 = count;
							}
						} else if (min2 > count) {
							min2 = count;
						}
	
						if (min2 < min1) {
							int tmp = min2;
							min2 = min1;
							min1 = tmp;
						}
					}
					count = 0;
					sum = 0;
					break;
				} else if (sum > target) {
					sum = 0;
					count = 0;
					break;
				}
	
			}
		}
		return (min1 == 0 ? -1 : min1 + min2);
	}
}
