package mediumArrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualK560 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Solution s = new Solution();
      subarraySum(new int[] {1,2,3}, 3);
	}
	
	public static int subarraySum(int[] nums, int k) {
       int result=0,sum=0;
       Map<Integer,Integer> preSum = new HashMap<Integer, Integer>();
       preSum.put(0, 1);
       for(int i=0;i<nums.length;i++) {
    	   sum+=nums[i];
    	   if(preSum.containsKey(sum-k)) {
    		   result+=preSum.get(sum-k);
    	   }
    	   preSum.put(sum, preSum.getOrDefault(sum, 0)+1);
       }
       
       return result;
    }
	
	
	class  Solution {
	    
	        
	}

}
