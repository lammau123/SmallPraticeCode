package small.code.pratice.string;

import java.math.BigInteger;
//import for Scanner and other utility classes
import java.util.*;

public class Pemulcation {
	/*public static void main(String[] args) {
		solve(new int[] {1, 2, 3, 4}, 1, "");
		System.out.println();
		solve(new int[] {1, 2, 3, 4}, 2, "");
		System.out.println();
		solve(new int[] {1, 2, 3, 4}, 3, "");
		System.out.println();
		solve(new int[] {1, 2, 3, 4}, 4, "");
		System.out.println();
	}

	private static void solve(int[] nums, int n, String s) {
		if(n > 0) {
			for(int i = 0; i < nums.length; i++) {
				String tmp= s + nums[i];
				solve(nums, n-1, tmp);
			}
		} else {
			System.out.print(s + " ");
		}
	} */
	
	public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
		Class<?> tt = Class.forName("small.code.pratice.string.Foo");
		Foo f = (Foo) tt.newInstance();
        // Write your code here
        Scanner s = new Scanner(System.in);
        int T = Integer.parseInt(s.nextLine().trim());
        while(T > 0){
            int N = Integer.parseInt(s.nextLine().trim());
            T--;
            System.out.println(solve(N));
            //System.out.println((1000000000L + 999999919L)%1000000009);
            
        }
    }

	private static int solve(int N){
        if(N == 0) return 1;
        if(N == 1) return 10;
        BigInteger no1AtEnd = BigInteger.ONE;
        BigInteger prevResult = BigInteger.TEN;
        BigInteger result = BigInteger.ZERO;
        for(int i = 2; i <= N; i++){
            result = prevResult.multiply(BigInteger.TEN).subtract(no1AtEnd);
            no1AtEnd = prevResult;
            prevResult = result;
        }
        return result.mod(BigInteger.valueOf(1000000009L)).intValue();
    }
	
    private static int solve1(int N){
		/*
		 * if(N == 0) return 1; if(N == 1) return 10; long no1AtEnd = 1; long prevResult
		 * = 10; long result = 0; long remain = 0; for(int i = 2; i <= N; i++){ result =
		 * 10*prevResult - no1AtEnd; no1AtEnd = prevResult; prevResult = result;
		 * if(result >= 1000000009L){ result %= 1000000009L; } } return (int)result;
		 */
    	long result = 1;
    	long remain = 0;
    	for(int i = 1; i <= N; i++) {
    		result *= 10;
    		if(result >= 1000000009L) {
    			remain = (result + remain) % 1000000009L;
    			result = 1L;
    		}
    	}  
    	
    	return (int)(remain == 0 ? result : remain);
    }
    
    
    static class TT{
    	public TT() {
    		System.out.println("helo");
    	}
    }
}
