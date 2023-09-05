package Discovery;

import java.util.ArrayList;

public class SumSubarray {

	public static void main(String[] args) {
		int n =5;
		int[] a = {1,7,3,7,5};
		int sum = 12;
		
		System.out.println(findSubArray(a,n,sum));

	}

	private static ArrayList<Integer> findSubArray(int[] a, int n, int sum) {
		int curr_sum = a[0];
		int i=0,j=0;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while(j<n) {
			if(curr_sum==sum) {ans.add(i);ans.add(j);return ans;}
			if(curr_sum<sum) {j++;curr_sum +=a[j]; continue;}
			if(curr_sum>sum) {curr_sum -= a[i];i++;continue;}
		}
		
		return ans;
		
	}

}
