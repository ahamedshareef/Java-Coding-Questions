package leetcode;

import java.util.Arrays;

public class LongestConsequtiveSeq128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {100,4,200,1,3,2};
		longestConsecutive(myArray);

	}
	
 public static int longestConsecutive(int[] nums) {
	 
	 Arrays.sort(nums);
	 int current_count = 0,max_count = 0;
	 for(int i=0;i<nums.length-1;i++) {
		 if(nums[i]==nums[i+1]+1) 
		 {current_count++;
		 }else
		 max_count = Math.max(current_count, max_count);
	 }
	 
	 return max_count;
        
    }

}
