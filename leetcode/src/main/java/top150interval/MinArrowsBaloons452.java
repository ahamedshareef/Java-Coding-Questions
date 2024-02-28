package top150interval;

import java.util.Arrays;

public class MinArrowsBaloons452 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] balloons = {{7,10}, {1,5}, {3,6}, {2,4}, {1,4}};
		findMinArrowShots(balloons);

	}
	
	
	 public static int findMinArrowShots(int[][] points) {
		 if(points.length==0) {
			 return 0;
		 }
		 
		// Arrays.sort(points,(a,b) ->a[1] - b[1]);
		 Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));


		 //This is a lambda expression 
		 //If a[1] - b[1] is negative, it means a should come before b in the sorted
		 //If a[1] - b[1] is positive, it means b should come before a in the sorted 
		 //If a[1] - b[1] is zero, the order between a and b 
		 
		 int arrowPos = points[0][1];
		 int arrowCount =1;
		 for(int i=1;i<points.length;i++) {
			 if(arrowPos >= points[i][0]) {continue;}
			 arrowCount++;
			 arrowPos = points[i][1];
		 }
	        
		 return arrowCount;
	    }
	 
	

}
