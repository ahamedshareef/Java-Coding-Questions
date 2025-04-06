package top150interval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	    
	
	public int[][] insert(int[][] intervals, int[] newInterval) {
	        List<int[]> result = new ArrayList<>();
	        boolean inserted = false;
	        
	        if(intervals.length==0) {
	        	return new int[][] {newInterval};
	        }
	        
	        for (int[] interval : intervals) {
	        	
	        	if(interval[1]< newInterval[0]) {result.add(interval);}
	        	
	        	else if(newInterval[1]< interval[0]) {
	        		
	        		if(!inserted) {
	        			result.add(newInterval);
	        			inserted = true;
	        		}
	        		result.add(interval);
	        		
	        	}
	        	
	        	else {
	        		newInterval[0] = Math.min(interval[0],newInterval[0]);
	        		newInterval[1] = Math.max(interval[1],newInterval[1]);
	        	}
	        	
	        }
	        
	        if(!inserted) {
	        	result.add(newInterval);
	        }

	        return result.toArray(new int[result.size()][]);
	        
	    }
	

}
