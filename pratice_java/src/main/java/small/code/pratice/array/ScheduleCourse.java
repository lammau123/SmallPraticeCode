package small.code.pratice.array;

import java.util.Arrays;

public class ScheduleCourse {
    public int scheduleCourse(int[][] courses) {
    	Arrays.sort(courses, (int[] a1, int[] a2) -> a1[1] - a2[1]);
    	int days = 0, count = 0;
    	int maxDayCourse = 0;
    	for(int course = 0; course < courses.length; course++) {
    		if(days + courses[course][0] <= courses[course][1]) {
    			days += courses[course][0];
    			count++;
    		} else {
    			maxDayCourse = course;
    			for(int i = 0; i < course; i++) {
    				if(courses[i][0] > courses[maxDayCourse][0]) {
    					maxDayCourse = i;
    				}
    			}
    			days += courses[course][0] - courses[maxDayCourse][0];
    			courses[maxDayCourse][0] = -1;
    		}
    	}
        return count;
    }   
}
