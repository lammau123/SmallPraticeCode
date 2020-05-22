package small.code.pratice.array;

public class BusyStudent {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
    	int count = 0;
        for(int start = 0; start < startTime.length; start++) {
        	if(startTime[start] <= queryTime &&  queryTime <= endTime[start]) {
        		count++;
        	}
        }
        return count;
    }
}
