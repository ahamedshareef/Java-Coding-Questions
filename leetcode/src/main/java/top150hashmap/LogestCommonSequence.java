package top150hashmap;

import java.util.HashMap;
import java.util.Map;

public class LogestCommonSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0,3,7,2,5,8,4,6,0,1};
		longestConsecutive(nums);

	}
	
public static int longestConsecutive(int[] nums) {
	int res = 0;
	
	Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
	
	for(int i=0;i<nums.length;i++) {
		int sum =0;
		if(!mp.containsKey(nums[i])) {
			int left_val = mp.containsKey(nums[i]-1) ? mp.get(nums[i]-1):0;
			int right_val = mp.containsKey(nums[i]+1) ? mp.get(nums[i]+1):0;
			sum = left_val + right_val +1;
			mp.put(nums[i], sum);
			
			
			res = Math.max(sum, res);
			
			// update the left of current N and righ tof current N if they are not found in that case lef_val and right_val will be 0 which will update the same n with same sum. so no harm
			
			mp.put(nums[i]- left_val, sum);
			
			mp.put(nums[i] + right_val , sum);
			
		}
		
		else {
			continue;
		}
	}
	
    return res;    
    }


}
