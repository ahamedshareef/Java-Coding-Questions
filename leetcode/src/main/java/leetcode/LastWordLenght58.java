package leetcode;

public class LastWordLenght58 {

	public static void main(String[] args) {
		
		String s = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord2(s));

	}
	
private static int lengthOfLastWord2(String s) {
		int len=0;
	for(int i=s.length()-1;i>=0;i--) {
		if(s.charAt(i) != ' ') {
			len++;
		}
		else {
			if(len>0) return len;
		}
	}
	
	return len;
		
	}

	private static void lengthOfLastWord(String s) {
		
		
	    String[] words = s.trim().split(" ");
	    int slength  = words.length-1;
	    System.out.println(words[slength].length());
		
		
	}

}
