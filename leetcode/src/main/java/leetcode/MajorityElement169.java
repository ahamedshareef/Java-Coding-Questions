package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

	public static void main(String[] args) {
		int nums[] = {3,2,3};
		majorityElement(nums);
	
	}
	
public static int majorityElement(int[] nums) {
	Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
	
	for(int num : nums) {
		Integer i = mp.get(num);
		if(i==null) {mp.put(num, 1);}
		else {mp.put(num, i+1);}
		
	}
	
	for(int num: mp.keySet()) {
		
	}
	
	
	
	return 0;
        
    }




public int majorityElement2(int[] nums) {
    Arrays.sort(nums);
    
 return nums[nums.length/2];
}





}
