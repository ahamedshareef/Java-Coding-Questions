package leetcode;



public class RemoveValueFromArray27 {

	public static void main(String[] args) {
		
		int[] nums = {3,2,2,3}; // Input array
		int val = 3; // Value to remove		
		removeElement(nums, val);
		
		

	}

	//use the same space.
	
	private static int removeElement(int[] nums, int val) {
		
		int final_index =0;
		for (int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[final_index++]=nums[i];
			}
		}
		return final_index;
		
	}

	
	
	//use extra space.
	private static int removeElement2(int[] nums, int val) {

		int[] fnArr = new int[nums.length];
		int j=0;
		for(int i=0;i<nums.length;i++) {
			
			
			if(nums[i]==val) {
				continue;
			}
			else {
				fnArr[j++]=nums[i];
			}
		}
		
		int fnLenght = fnArr.length;
		for(int i:fnArr)
		{
			if(i==0)
				fnLenght = fnLenght-1;
		}
		System.out.println(fnLenght);
		return fnLenght;
	}

}
