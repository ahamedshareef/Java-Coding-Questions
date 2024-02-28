package top150bitmanipulation;

public class BitReverse190 {

	public static void main(String[] args) {
		System.out.println(reverseBits(-1610612736));

	}
	
	public static int reverseBits(int n) {
	    if (n == 0) return 0;
	    
	    int result = 0;
	    for (int i = 0; i < 32; i++) {
	        result <<= 1;
	        if ((n & 1) == 1) result++;
	        n >>= 1;
	    }
	    return result;
	}
	
	// more optimized
	public int reverseBits2(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans |= (n & 1);
            n >>= 1;
        }
        return ans;
    }
	
}


