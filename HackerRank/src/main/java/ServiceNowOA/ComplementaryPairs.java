package ServiceNowOA;

import java.util.HashMap;
import java.util.Map;

public class ComplementaryPairs {
	    public static void main(String[] args) {
	        String[] strings = {"abac", "cab", "abc", "bca"};
	        int count = countComplementaryPairs(strings);
	        System.out.println("The number of complementary pairs that can be formed is: " + count);
	    }

	    public static int countComplementaryPairs(String[] strings) {
	        int count = 0;
	        for (int i = 0; i < strings.length; i++) {
	            for (int j = i + 1; j < strings.length; j++) {
	                String concat = strings[i] + strings[j];
	                if (isPalindromePossible(concat)) {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }

	    public static boolean isPalindromePossible(String s) {
	        Map<Character, Integer> charCount = new HashMap<>();
	        
	        for (char c : s.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }
	        
	        int oddCount = 0;
	        for (int count : charCount.values()) {
	            if (count % 2 != 0) {
	                oddCount++;
	            }
	            if (oddCount > 1) {
	                return false;
	            }
	        }
	        return true;
	    }

}
