package top150.trees;

public class SearchRotated33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int search(int[] nums, int target) {
	
	int left = 0;
	int right = nums.length -1;
	
	if(nums.length ==0) return -1;
	if(nums.length==1) return nums[0];
	
	while(left<=right) {
		int mid = left + (right-left)/2;
		
		if(nums[mid]== target) return mid;
		
		if(nums[left]<=nums[mid]) {
			
		}
	}
	
        
    }


}
