package top150bitmanipulation;

public class SingleNumber136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int singleNumber(int[] nums) {
	
	if(nums.length ==1) return nums[0];
	int a =0;
	
	for(int i=0;i<nums.length;i++) {
		a= nums[i] ^ a;
	}
	
	return a;
        
    }

//XOR -> same 0 different 1, it eliminates the same numbers.

	
	

}
