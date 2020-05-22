package small.code.pratice.string;

public class MaxPower {
	 public int maxPower(String s) {
		 char current = ' ';
		 int max = 0, count = 0;;
		 for(char c: s.toCharArray()) {
			 if(current != c) {
				 max = Math.max(max, count);
				 count = 1;
				 current = c;
			 } else {
				 count++;
			 }
		 }
		 
		 return Math.max(max, count);
	 }
}
