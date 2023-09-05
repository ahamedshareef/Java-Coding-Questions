package leetcode;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 + 1 + 2+ 3 + 5+  
		System.out.println(climbStairs(3));
		

	}
	
	public static int climbStairs(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		int[] a = new int[n+1];
		a[0]=1;
		a[1]=1;
		
		for (int i =2; i<=n;i++) {
			a[i] = a[i-1] + a [i-2];
		}
		return a[n];
		
		
	}

}
