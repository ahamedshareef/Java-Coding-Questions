package top150.trees;

public class FirstLast34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int[] searchRange(int[] nums, int target) {
	
	 int[] result = {-1, -1};
	// Edge case: empty array
     if (nums.length == 0) {
         return result;
     }
     
  // Find the first position
     result[0] = findBoundary(nums, target, true);
     
  // If target not found, return [-1, -1]
     if (result[0] == -1) {
         return result;
     }
     
  // Find the last position
     result[1] = findBoundary(nums, target, false);
     
     return result;
     
     
        
    }

//Helper method to find either the first or last occurrence
// isFirst = true to find first occurrence, false to find last occurrence


private int findBoundary(int[] nums, int target, boolean isFirst) {
	
	int left =0;
	int right = nums.length -1;
	int index = -1;
	
	
	while(left<=right) {
		
		int mid = left + (right-left)/2;
		
		if(nums[mid]==target) {
			index = mid;
			
			if(isFirst) {
				right = mid-1;
			}else {left = mid+1;}
		} else if (nums[mid]<target) {
			left = mid+1;
			
		}else {
			right = mid-1;
		}
	}
	return index;
}


}
