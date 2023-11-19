package top150math;

public class PlusOneArray66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,9};
		plusOne(nums);

	}
	
	 public static int[] plusOne(int[] digits) {
		 // when ever we encounter a digit less than 9 it will return by adding 1
		 // if the digits are 9 then i will make it 0 and increment the next digit
		 // if the next digit is also 9,9,9 it will make a new array and put 1 in the front and return.
		 
	        for (int i=digits.length-1;i>=0;i--) {
	        	if(digits[i]<9) {
	        		digits[i]++;
	        		return digits;
	        	}
	        	digits[i] =0;
	        }
	        
	        digits = new int[digits.length+1];
	        digits[0] =1;
	        return digits;
	    }
	
	

}
