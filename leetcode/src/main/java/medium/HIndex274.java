package medium;

/*
 * https://leetcode.com/problems/h-index/description/?envType=study-plan-v2&envId=top-interview-150
 * 
 * It first creates a counting sort array to store the frequency of each citation value
Then it iterates from the maximum possible h-index (n) downwards
At each index i, it checks if the frequency (count) is greater than or equal to i
If so, i is the h-index and it returns i
Otherwise, it continues to the next lower index

 */

public class HIndex274 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hIndex(new int[]{3,0,6,1,5});
	}
	
	
	public static int  hIndex(int[] citations) {
	    int n = citations.length;
	    int[] buckets = new int[n+1];
	    for(int c : citations) {
	        if(c >= n) {
	            buckets[n]++;
	        } else {
	            buckets[c]++;
	        }
	    }
	    int count = 0;
	    for(int i = n; i >= 0; i--) {
	        count += buckets[i];
	        if(count >= i) {
	            return i;
	        }
	    }
	    return 0;
	}

}
