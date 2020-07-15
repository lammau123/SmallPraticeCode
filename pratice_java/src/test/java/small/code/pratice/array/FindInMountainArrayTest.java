package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FindInMountainArrayTest {
	@Test
	void testFindInMountainArray() {
		assertTrue(new FindInMountainArray().findInMountainArray(16, new MountainArray() {
			int[] data = new int[] {1,6,11,16,21,16,0};
			@Override
			public int length() {
				return data.length;
			}
			
			@Override
			public int get(int index) {
				return data[index];
			}
		}) == 3);
		
		assertTrue(new FindInMountainArray().findInMountainArray(481, new MountainArray() {
			int[] data = new int[] {1,6,11,16,21,26,31,36,41,46,51,56,61,66,71,76,81,86,91,96,101,106,111,116,121,126,131,136,141,146,151,156,161,166,171,176,181,186,191,196,201,206,211,216,221,226,231,236,241,246,251,256,261,266,271,276,281,286,291,296,301,306,311,316,321,326,331,336,341,346,351,356,361,366,371,376,381,386,391,396,401,406,411,416,421,426,431,436,441,446,451,456,461,466,471,476,481,486,491,496,501,496,491,486,481,476,471,466,461,456,451,446,441,436,431,426,421,416,411,406};
			@Override
			public int length() {
				return data.length;
			}
			
			@Override
			public int get(int index) {
				return data[index];
			}
		}) == 96);
		
		assertTrue(new FindInMountainArray().findInMountainArray(3, new MountainArray() {
			int[] data = new int[] {1,2,3,4,5,3,1};
			@Override
			public int length() {
				return data.length;
			}
			
			@Override
			public int get(int index) {
				return data[index];
			}
		}) == 2);
		
		assertTrue(new FindInMountainArray().findInMountainArray(3, new MountainArray() {
			int[] data = new int[] {0,1,2,4,2,1};
			@Override
			public int length() {
				return data.length;
			}
			
			@Override
			public int get(int index) {
				return data[index];
			}
		}) == -1);
	}
}
