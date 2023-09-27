package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicStrings {

	public static void main(String[] args) {
		String s = "paper", r = "title";
		System.out.println(findIsom(s,r));
		// e->a g->d g->d 
		

	}

	private static boolean findIsom(String s, String r) {
		

		Map<Character,Character> mp1 = new HashMap<>();
		Map<Character,Boolean> mp2 = new HashMap<>();
		
		if(! (s.length() == r.length())) {return false;}

		for(int i=0;i<s.length();i++){
			char sc = s.charAt(i);
			char rc = r.charAt(i);
			
			if(mp1.containsKey(sc)== true) {
				if(mp1.get(sc) != rc) return false;
			}
			else if(mp2.containsKey(rc)== true) 
				return false;
			else {
				mp1.put(sc, rc);
				mp2.put(rc, true);
			}
		}
		return true;
		
	}

}
