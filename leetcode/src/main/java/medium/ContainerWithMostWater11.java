package medium;

public class ContainerWithMostWater11 {

	public static void main(String[] args) {
		
		System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));

	}
	
	// my solution
	 public static int maxArea1(int[] height) {
		 int max_volume=0;
		for(int i=0,j=height.length-1;i<=j;) {
			int min_height = Math.min(height[i], height[j]);
			
			max_volume = Math.max(max_volume, min_height * (j-i));
			
			if(min_height == height[i])i++;
			else j--;
		}
		return max_volume;
	        
	    }
	 
	 //same as above little different.
	 
	 public static int maxArea(int[] height) {
		 int left = 0;
	        int right = height.length - 1;
	        int max = 0;
	        while(left < right){
	            int w = right - left;
	            int h = Math.min(height[left], height[right]);
	            int area = h * w;
	            max = Math.max(max, area);
	            if(height[left] < height[right]) left++;
	            else if(height[left] > height[right]) right--;
	            else {
	                left++;
	                right--;
	            }
	        }
	        return max;
	 }
		 
	 

}
