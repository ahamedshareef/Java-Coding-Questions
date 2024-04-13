package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class RelativeRanks506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findRelativeRanks(new int[] {2,5,3,1,4,7}); // 5,4,3,2,1
		

	}
	
public static String[] findRelativeRanks(int[] score) {
        
        int n = score.length;
        String[] res = new String[n];
        
        PriorityQueue<Integer> pq = 
            new PriorityQueue<>((a,b)-> score[b]-score[a]);
        
        
        System.out.println();
        for(int i=0;i<n;i++){
            pq.add(i);
        }
       
		int i = 1;
		while (!pq.isEmpty()) {

			int idx = pq.poll();

			if (i > 3) {
				res[idx] = Integer.toString(i);
			} else if (i == 1) {
				res[idx] = "Gold Medal";
			} else if (i == 2) {
				res[idx] = "Silver Medal";
			} else if (i == 3) {
				res[idx] = "Bronze Medal";
			}
			i++;
		}		 
        
        return res;
        
    }

}
