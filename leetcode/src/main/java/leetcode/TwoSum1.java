package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,7,11,15};
		int target = 22;
		
		System.out.println(Arrays.toString(findTwoSums(nums, target)));

	}

	private static int[] findTwoSums(int[] nums, int target) {
		
		 HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		 int toReturn[] = new int[2];
	        for(int i = 0; i < nums.length; i++){

	            int diff = (target - nums[i]);
	            
	            System.out.println(diff);
	            
	            if(hash.containsKey(diff)){
	                 toReturn[0] = hash.get(diff);
	                 toReturn[1] = i;
	                return toReturn;
	            }

	            hash.put(nums[i], i);

	        }
	        
	        return toReturn;
	}

	private static int[] findTwoSums2(int[] nums, int target) {
		
	int[] lp = new int[2];
	
	for(int i=0;i<nums.length-1;i++) {
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]+nums[j]== target) {
				lp[0]=i;lp[1]=j; return lp;
			}
		}
	}
	
	return lp;
			
	
	}

}
