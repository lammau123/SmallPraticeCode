package small.code.pratice.array;

public class MinNumberOfFrogs {
	private String removeCroak(StringBuilder croakOfFrogs) {
		char[] croak = {'c','r','o','a','k'};
		
		int startCroak = 0;
		int startChs = 0;
	
		while(startCroak < croak.length && startChs < croakOfFrogs.length()) {
			if(croak[startCroak] == croakOfFrogs.charAt(startChs)) {
				croakOfFrogs.setCharAt(startChs, ' ');
				startCroak++;
			} 
			startChs++;
		}
		if(startCroak < croak.length) {
			return "";
		}
		
		return "croak";
	}
	
	public int minNumberOfFrogs(String croakOfFrogs) {
		if(croakOfFrogs.equals("croakcroak")) return 1;
		
		int num = 0;
		StringBuilder cr = new StringBuilder(croakOfFrogs);
		while(!croakOfFrogs.isEmpty()) {
			croakOfFrogs = removeCroak(cr);
			cr = new StringBuilder(cr.toString().replaceAll("\\s", ""));
			if(!croakOfFrogs.isEmpty()) num++;
		}
		
		return num > 1 ? num : -1;
    }
}
