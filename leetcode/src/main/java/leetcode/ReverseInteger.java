package leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse_int(-123));

	}
	
	// 3 steps process to remember --

	private static int reverse_int(int x) {
		
		
		int rev=0;
		
		while(x!=0) {
			
			int digit = x %10;
			rev = (rev * 10)+digit;
			x = x/10;
				
		}
		return rev;
	}

}
