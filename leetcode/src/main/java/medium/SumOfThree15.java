package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfThree15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
threeSum(new int[] {-1,0,1,2,-1,-4});
	}
	
	
	 public static List<List<Integer>> threeSum(int[] nums) {
		 int target=0;
		 List<List<Integer>> threeSum = new ArrayList<>();
		 Set<List<Integer>> set = new HashSet<>();
		 Arrays.sort(nums);
		 
		 for(int i=0;i<nums.length-2;i++) {
			
			 int l=i+1;
			 int r=nums.length-1;
			 while(l<r) {
				 int sum = nums[i]+nums[l]+nums[r];
				 
				 if(sum==target) {
					 set.add(Arrays.asList(nums[i],nums[l],nums[r]));
					 l++;r--;
				 }else if(sum<target) {
					 l++;
				 }else if(target<sum) {
					 r--;
				 }
			 }
		 }
		 
		 threeSum.addAll(set);
		 return threeSum;
	        
	    }
	 

}
