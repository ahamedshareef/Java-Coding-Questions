package leetcode;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		
		reverseString(s);

	}

	private static void reverseString(char[] s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb.toString());
		
	}

	private static void reverseString2(char[] s) {
		
		
		for(int j=s.length-1, i =0; i<s.length /2; i++,j--) {
		
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			
			
		}
		
		System.out.println(Arrays.toString(s));
		
	}
	
	
	

}
