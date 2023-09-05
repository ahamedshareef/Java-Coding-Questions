package leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abba", s = "dog cat cat dog";
		System.out.println(wordPattern(pattern,s));
		
		//a -> dog , b -> cat, b -> cat, a -> dog
	}

	private static boolean wordPattern(String pattern, String s) {
		
		Map<Character,String> mp1 = new HashMap<>();
		Map<String,Boolean> mp2 = new HashMap<>();

		if(pattern.length() != s.trim().split(" ").length) return false;
		
		for(int i=0;i<pattern.length();i++) {
			char ch1 = pattern.charAt(i);
			String str1 = s.trim().split(" ")[i];
			
			if(mp1.containsKey(ch1)== true) {
				if(!mp1.get(ch1).equalsIgnoreCase(str1) ) return false;
			}else if(mp2.containsKey(str1)== true) {return false;}
			else {
				mp1.put(ch1, str1);
				mp2.put(str1, true);
			}
		}
		return true;
	}

}
