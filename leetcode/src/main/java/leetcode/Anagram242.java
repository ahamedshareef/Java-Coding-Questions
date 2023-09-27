package leetcode;

import java.util.Arrays;

public class Anagram242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("nagaram","anagram"));
	}
	
	
	 private static boolean isAnagram(String s, String t) {
		 
		int[] alphabet_counter = new int[26];
		for(char ch:s.toCharArray()) {alphabet_counter[ch-'a']++;}
		for(char ch:t.toCharArray()) {alphabet_counter[ch-'a']--;}
		
		for(int i:alphabet_counter) {if(i!=0) return false;}
		return true;
	}


	public static boolean isAnagram2(String s, String t) {

	       char[] ch = s.toCharArray();
	       Arrays.sort(ch);
	       
	       char[] ch1 = t.toCharArray();
	       Arrays.sort(ch1);
	       String s1 = String.valueOf(ch1);
	       String s2 = String.valueOf(ch);
	       System.out.println(s1);
	       System.out.println(s2);
	       
	       if(s1.equalsIgnoreCase(s2))
	       return true;
	       else
	    	   return false;
	       
	        
	    }

}
