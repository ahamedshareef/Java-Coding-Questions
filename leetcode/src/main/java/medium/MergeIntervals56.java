package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,3},{2,6},{15,18},{8,10}};
		
		merge(intervals);

	}
	
	
	  public static int[][] merge(int[][] intervals) {
		  if (intervals.length <= 1)
				return intervals;
		  
		  Arrays.sort(intervals,(i1, i2) -> Integer.compare(i1[0], i2[0]));
		  
		  List<int[]> result = new ArrayList<>();
		  int[] newInterval = intervals[0];
		  result.add(newInterval);
		  
		 
		  for(int[] interval :intervals) {
		  if(interval[0] <= newInterval[1]) {
			  newInterval[1] = Math.max(newInterval[1], interval[1]);	  
		  }else {
			  newInterval = interval;
			  result.add(newInterval);
			  
		  }
			  
		  }
	  return result.toArray(new int[result.size()][]);
		 // return result.toArray(new int[result.size()][]);
	        
	    }
	

}
