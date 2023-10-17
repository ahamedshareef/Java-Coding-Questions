package medium;

/*
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.


Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. 
Its maximum jump length is 0, which makes it impossible to reach the last index.


 */

/*
 * Always go for maximum distance you can reach
 * if current + current jumps > reachable update reachable
 * if I crosses your reachable and reachable is less that means 
 * in no way you can reach that place, hence return false.
 */

public class JumpGame55 {

	public static void main(String[] args) {
		int[] a = {2,3,1,1,4};
		System.out.println(canJump(a));
		
		
	}
	
	
	 public static boolean canJump(int[] nums) {
		 int reachable =0;
		 for(int i=0;i<nums.length;++i) {
			 if(i>reachable) return false;
			 reachable = Math.max(reachable, i+nums[i]);
		 }
		 return true;
	 }

}
