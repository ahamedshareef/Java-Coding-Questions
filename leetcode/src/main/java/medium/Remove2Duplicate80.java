package medium;

public class Remove2Duplicate80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = new int[]{1,1,1,2,2,3};
		 System.out.println("Answer is ->"+removeDuplicates(a)); 

	}
	
	public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int n: nums){
        if(i<2 || n>nums[i-2]){  // alternatively we can use n != nums[i-2]
            nums[i++] =n;
        }
        }
        return i;
    }

}
