package mediumArrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElement2149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
   public static int[] rearrangeArray(int[] nums) {
        List<Integer> listP = new ArrayList<Integer>();
        List<Integer> listN = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]>=0) {
        		listP.add(nums[i]);
        	}else
        		{listN.add(nums[i]);}
        	
        }
        
        int pos = 0,neg = 0,index=0;
        while(pos<listP.size() && neg<listN.size() && index<nums.length) {
        	nums[index++] = listP.get(pos++);
        	if(index>=nums.length) break;
        	nums[index++] = listN.get(neg++);
        }
        
        while(pos<listP.size())
        	nums[index++] = listP.get(pos++);
        while(pos<listN.size())
        	nums[index++] = listN.get(neg++);
      return  nums;
    }
   
   /*
    * Store Positive in Positive List
Store Negative in Negative List

take 3 pointers 
index for iterating nums
pos for iterating positive
neg for iterating negative

loop for alternative 
loop for remaining positive 
loop for remaining negative
return nums;


    */

}
