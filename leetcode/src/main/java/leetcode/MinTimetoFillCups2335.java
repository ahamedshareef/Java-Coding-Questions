package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinTimetoFillCups2335 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int fillCups(int[] amount) {
		int mx=0,sum=0;
		for(int i:amount) {
			mx = Math.max(mx, i);
			sum += i;
		}
		
		return Math.max(mx, (sum+1)/2);
	}
	
public int fillCups2(int[] amount) {
	Queue <Integer> q = new PriorityQueue<>(Collections.reverseOrder());
	q.add(amount[0]);
	q.add(amount[1]);
	q.add(amount[2]);
	
	int count=0;
	
	while(q.size()>1) {
		int a = q.poll();
        int b = q.poll();
        if(a>0 || b>0) {
        	count ++;
        }
        a--;b--;
        if(a>0){
            q.add(a);

        }
        if(b>0){
            q.add(b);
        }
		
        if(!q.isEmpty()) {
        	count += q.poll();
        }
	}
	return count;
    }

}
