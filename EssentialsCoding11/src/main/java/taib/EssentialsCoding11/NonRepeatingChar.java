package taib.EssentialsCoding11;
import java.util.HashMap;

public class NonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // NOTE: The following input values will be used for testing your solution.
        nonRepeating("abcab"); // should return 'c'
        nonRepeating("abab"); // should return null
        nonRepeating("aabbbc"); // should return 'c'
        nonRepeating("aabbdbc"); // should return 'd'

	}
	
	 // Implement your solution below.
    public static Character nonRepeating(String s) {
    	HashMap<Character,Integer> mp = new HashMap<Character, Integer>();
    	Character ans = null;
    	
    	for(char c: s.toCharArray()) {
    		int newInt = mp.getOrDefault(c, 0);
    		mp.put(c, newInt+1);
    	}
    	
    	for(char c: s.toCharArray()) {
    		if(mp.get(c) == 1)
    			{ans =c; break;}
    	}
    	
    	
        return ans;
    }
    
    

}
