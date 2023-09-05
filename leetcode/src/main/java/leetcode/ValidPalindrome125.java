package leetcode;

public class ValidPalindrome125 {

	public static void main(String[] args) {
String s = "race a car";
String s2 = "A man, a plan, a canal: Panama";

System.out.println(isPalindrome (s));
	}

	private static boolean isPalindrome(String s) {
		
		if(s.isEmpty()) {
			return true;
		}
		
		int head=0, tail=s.length()-1;
		char cHead,cTail;
		while(head <= tail) {
			cHead = s.charAt(head);
			cTail = s.charAt(tail);
			
			if(!Character.isLetterOrDigit(cHead)) {
				head++;
			}else if(!Character.isLetterOrDigit(cTail)) {
				tail--;
			}else {
				if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
					return false;
				}
				head++;
				tail--;
			}
		}
		return true;
		
	}

}
