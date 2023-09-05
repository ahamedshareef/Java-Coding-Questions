package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int [] nums = {1,2,3,1,2,3};
	 int k = 2;
	 
	 //*Given an integer array nums and an integer k, 
	 //return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
	 
	 System.out.println(containsDuplicate(nums,k));

	}

	private static boolean containsDuplicate(int[] nums, int k) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> seen = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			
			if(!seen.containsKey(nums[i])) {
				seen.put(nums[i],i);
			}
			else {
				int pastindex = seen.get(nums[i]);
				if (Math.abs(pastindex - i )<=k)
				{
					return true;
				}
				seen.put(nums[i], i);					
			}
		}
		return false;
		
	}

	private static boolean containsDuplicate2(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<nums.length-1;i++) {
			for(int j = i+1;j<nums.length;j++) {
				if(nums[i]==nums[j] && Math.abs(i-j)<=k) {
					return true;
				}
			}
		}
		return false;
	}

}
