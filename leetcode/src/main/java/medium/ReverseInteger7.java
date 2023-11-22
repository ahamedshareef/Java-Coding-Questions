package medium;

public class ReverseInteger7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(123));

	}
	
	/*
	 * We have to check if result is more than Integer.MAX_VALUE or less than 
Integer.MIN_VALUE
then we return 0;

which is y we are using 
if ((result - digit) / 10 != rev)
           { return 0; }

better approach will be to use:

if(rev*10+digit>=Integer.MAX_VALUE|| rev*10+digit<=Integer.MIN_VALUE){
                sum=0;
                break;
            } 

	 */
    public static int reverse(int x) {
    	boolean negative= false;
       if(x <0)
       { negative= true; x*=-1; }
       int rev = 0;
       
       while(x!=0) {
    	   int digit = x%10;
    	   int result = (rev*10) + digit;
    	   if ((result - digit) / 10 != rev)
           { return 0; }
    	  // if(rev*10+digit>=Integer.MAX_VALUE|| rev*10+digit<=Integer.MIN_VALUE){
            //   rev=0;
              // break;
           //} 
    	   rev = result;
    	   x=x/10;
       }
       
       
       return negative? rev*=-1:rev;
       
 
    }

}
