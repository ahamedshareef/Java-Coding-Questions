package leetcode;

public class RansomNote383 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aa", magazine = "aab";
		canConstruct(ransomNote,magazine);

	}
	
	
	 public static boolean canConstruct(String ransomNote, String magazine) {
		 int magazinelen = magazine.length();
		 int ransomNotelen = ransomNote.length();
		 if(magazinelen<ransomNotelen) {return false;}
		 
		 for(int i=0;i<magazinelen;i++) {
			char ch = magazine.charAt(i);
			
			// if(ransomNote.contains(ch))
			 {}
		 }
		 
		return false;
		
	        
	    }

}
