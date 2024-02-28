package top150bitmanipulation;

public class Numberof1Bits191 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		 
	}
	
	public int hammingWeight(int n) {
        
		if(n==0) return 0;
		int result =0;
		
		for(int i=0;i<32;i++) {
			if((n & 1)==1) result++;
			n >>=1;
		}
		return result;
    }

}
