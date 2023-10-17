package medium;
/*
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 */

/*
 * solution uses a sliding window, right, left and sum and 2 while loop.
 * 
 */
public class MinimumSubarray209 {

	public static void main(String[] args) {
		
		int[] nums = {2,3,1,2,4,3};
		int target =7;
		minSubArrayLen(target,nums);
		
		

	}
	
public static int minSubArrayLen(int target, int[] nums) {
	if (nums == null || nums.length == 0)
	    return 0;
	
    int l=0, r=0, sum=0,min_val = Integer.MAX_VALUE;   
	
	while(r<nums.length) {
		sum+=nums[r];
		while(sum >=target) {
			min_val=Math.min(min_val, r-l+1);
			sum-=nums[l];
			l++;
		}
		r++;
	}
	
	return min_val== Integer.MAX_VALUE ? 0:  min_val;
    }


	

}
