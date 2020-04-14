package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FindMaxLengthTest {
	@Test
	void findMaxLengthTest() {
		assertTrue((new FindMaxLength().findMaxLength(new int[] {1,1,1,1,1,1,1,0,0,0,0,1,1,0,1,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,1,1,0,0,0,0,1,0,0,1,1,1,1,1,0,0,1,0,1,1,0,0,0,1,0,0,0,1,1,1,0,1,1,0,1,0,0,1,1,0,1,0,0,1,1,1,0,0,1,0,1,1,1,0,0,1,0,1,1})) == 94);
		assertTrue((new FindMaxLength().findMaxLength(new int[] {0, 0, 0, 0, 0, 0, 1})) == 2);
		assertTrue((new FindMaxLength().findMaxLength(new int[] {1,1,0})) == 2);
		assertTrue((new FindMaxLength().findMaxLength(new int[] {0,1,1})) == 2);
		assertTrue((new FindMaxLength().findMaxLength(new int[] {0,1})) == 2);
		assertTrue((new FindMaxLength().findMaxLength(new int[] {0,1,0})) == 2);
		assertTrue((new FindMaxLength().findMaxLength(new int[] {0,1,0,0,1,0,1})) == 6);
		assertTrue((new FindMaxLength().findMaxLength(new int[] {0,1,0,0,1,0,1,0})) == 6);
	}
}
