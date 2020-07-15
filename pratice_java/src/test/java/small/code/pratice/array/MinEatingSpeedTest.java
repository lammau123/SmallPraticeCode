package small.code.pratice.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MinEatingSpeedTest {
    @Test
    void testMinEatingSpeed() {
    	assertTrue(new MinEatingSpeed().minEatingSpeed(new int[] {3,6,7,11}, 8) == 4);
    	assertTrue(new MinEatingSpeed().minEatingSpeed(new int[] {30,11,23,4,20}, 5) == 30);
    	assertTrue(new MinEatingSpeed().minEatingSpeed(new int[] {30,11,23,4,20}, 6) == 23);
    }
}
