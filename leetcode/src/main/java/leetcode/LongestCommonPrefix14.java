package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix14 {

	public static void main(String[] args) {
		
		String[] strs = {"flower","flow","flight"};
		longestCommonPrefix(strs);

	}

	private static String longestCommonPrefix(String[] strs) {
		int index = 0;
		Arrays.sort(strs);
		System.out.println(Arrays.toString(strs));
		
		String s1 = strs[0];
		String s2 = strs[strs.length-1];
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==s2.charAt(i))index++;
			else
			break;
		}
		
		System.out.println(s1.substring(0, index));
		return s1.substring(0, index);
		
	}

}
