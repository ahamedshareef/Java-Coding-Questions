package medium;

public class Jump2Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,3,1,1,4};
		
		System.out.println(new Jump2Game().jump(nums));
	}
	
	public int jump(int[] nums) {
		int ans = 0;
		int end = 0;
		int farthest = 0;
		if (nums.length == 1) {
			return 0;
		}

		for (int i = 0; i < nums.length - 1; ++i) {
			farthest = Math.max(farthest, i + nums[i]);
			if (farthest >= nums.length - 1) {
				++ans;
				break;
			}
			if (i == end) { // Visited all the items on the current level
				++ans; // Increment the level
				end = farthest; // Make the queue size for the next level
			}
		}

		return ans;
	}

}
