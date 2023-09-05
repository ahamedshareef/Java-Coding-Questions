package Zoho;

import java.util.HashSet;

/*
 * there are 2 Arrays
 * [1,2,3,4,5]
 * [3,4,5,10]
 * 
 * op: [1,2,3,4,5,10]
 */

public class UnionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,10};
		unionOfArray(a,b);
		

	}

	private static int unionOfArray(int[] a, int[] b) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i:a) {
			hs.add(i);
		}
		
		for(int i:b) {
			hs.add(i);
		}
		System.out.println(hs);
		
		return hs.size();
		
	}

}
