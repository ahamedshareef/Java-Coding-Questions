package leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxProduct1464 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int maxProduct(int[] nums) {
        Queue <Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i:nums) {
        	q.add(i);
        }
        
        return (q.poll()-1)* (q.poll()-1);
        
    }

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for(int i:nums){
            if(i>max1){
                max2 = max1;
                max1 = i;
            }
            else if(i>max2){
                max2 = i;
            }
        }
        return (max1-1)*(max2-1);
    }
}

}
