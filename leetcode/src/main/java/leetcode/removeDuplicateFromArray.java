package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://youtu.be/SKI8IirQZgo

public class removeDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,2,3,3,4,5,5,5,5,2};
		Arrays.sort(nums);
		System.out.println();
		System.out.println(Arrays.toString(nums));
		removeDuplicate(nums);
		
	}

	
	
	private static int removeDuplicate(int[] nums) {
		
		
		//1122334444
		int j =1;
		for(int i =0;i<nums.length-1;i++) {
		
			if(nums[i]!= nums[i+1]) {
			nums[j++] = nums[i+1];
		}
			}
		System.out.println(Arrays.toString(nums));
		return j;
		
	}



	private static int removeDuplicat2e(int[] nums) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> mp = new HashMap<>();
		int k =0;
		for(int i=0;i<nums.length;i++) {
			
			if(mp.get(nums[i])== null) {
				mp.put(nums[i], 1);
				k++;
				continue;
				
			}else {
				nums[i] =0;
			}
			
		}
		System.out.println(Arrays.toString(nums));
		return k;
		
		
	}

}
