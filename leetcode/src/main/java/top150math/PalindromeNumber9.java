package top150math;

public class PalindromeNumber9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 121;
System.out.println(isPalindrome(n));
	}
	
	 public static boolean isPalindrome(int x) {
	        if(x<0) return false;
	        
		 int rev =0;
		 int temp =x;
		 
		 while(temp!=0) {
			 rev = rev*10 + temp%10;
			 temp=temp/10;
		 }
		 
		 return rev == x;
	    }
	
	

}
