package leetcode;

public class RansomNote383 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ransomNote = "aa", magazine = "aab";
		System.out.println(canConstruct(ransomNote,magazine));
		 
	}
	
	
	public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
		int[] alphabet_Counter = new int[26];
		
		for(char c:magazine.toCharArray())
		{
		alphabet_Counter[c - 'a']++;
		}
		
		for(char c: ransomNote.toCharArray()) {
		if(alphabet_Counter[c - 'a'] == 0) return false;
		alphabet_Counter[c - 'a']--;
		}
		return true;
    }

}
