package leetcode;

import java.util.PriorityQueue;

public class KthLargestElementinStream703 {

	final PriorityQueue<Integer> pq;
	final int k;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthLargestElementinStream703 kl = new KthLargestElementinStream703(3, new int[] {4, 5, 8, 2});
		kl.add(4);
		kl.add(5);
		kl.add(10);
		kl.add(9);
		kl.add(4);
	}
	
	 public  KthLargestElementinStream703(int k, int[] nums) {
	        this.k=k;
	        pq = new PriorityQueue<>(k);
	        for(int n: nums) {
	        	add(n);// since this is in a constructor 
	        	//pq.add(n); // same as above
	        	
	        }
	        
	       
	    }
	    
	    public int add(int val) {
	    	if(pq.size() <k) pq.offer(val);
	    	
	    	else if (pq.peek()<val) {
	    		pq.poll();
	    		pq.offer(val);
	    	}
	    	return pq.peek();
	    	
			
	        
	    }

}
