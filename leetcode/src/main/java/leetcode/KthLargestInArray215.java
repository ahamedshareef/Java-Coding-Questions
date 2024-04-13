package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestInArray215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findKthLargest(new int[]{3,2,1,5,6,4},2));

	}
	
	public static int findKthLargest(int[] nums,int k){
		//final PriorityQueue<Integer> pq = new PriorityQueue<>();
		final PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int val:nums){
		pq.offer(val);
		
		System.out.println(pq);

		if(pq.size() > k) {
			System.out.println( pq.peek());
		            pq.poll();
		        }
		}

		return pq.peek(); 
		
		
		    } 
	
	/* public int findKthLargest2(int[] nums, int k) {
    final int N = nums.length;
    Arrays.sort(nums);
    return nums[N-k];
}*/

}
