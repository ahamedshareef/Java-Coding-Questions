package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(7));

}

	 public static boolean isHappy(int n) {
		// if the number is less than 10 it will have 
		 Set<Integer> seen = new HashSet<>();
		 
		 while(n !=1) {
			 int temp =n;
			 int sum =0;
			 
			 while(temp >0) {
				 sum += Math.pow(temp%10, 2);
				 temp = temp/10;
			 }
			 
			 if(seen.contains(sum)) {
				 return false;
			 }
			 else {
				 seen.add(sum);
				 n=sum;
			 }
			 
		 }
		 return true;
		 
		

		         
		     }

	}




