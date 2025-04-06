package top150.trees;

public class InsertPosition35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int searchInsert(int[] nums, int target) {
		 
		 int start =0;
		 int end = nums.length -1;
		 
		 while(start<= end) {
			int middle = ( start + end )/ 2;
			if(nums[middle]== target) return middle;
			if(nums[middle]<target)
				start = middle+1;
			if(nums[middle]>target)
				end = middle-1;
		 }
		 return start;
	        
	    }
	 
	 
	 public int findMin(int[] nums) {
		 
		 int left =0;
		 int right = nums.length -1;
		 
		 if (nums[left] < nums[right] || nums.length == 1) {
		        return nums[0];
		    }
		 
		 
		 while(left <right) {
			 int middle = (left+right) /2;
			 if(nums[middle]> nums[right])
				 left = middle+1;
			 else {
				 right = middle;
			 }
				 
		 }
		 return nums[left];
		 
		 
			 
	        
	    }
	 
	 

}
