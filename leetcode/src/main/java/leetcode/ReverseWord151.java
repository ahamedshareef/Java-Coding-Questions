package leetcode;

public class ReverseWord151 {

	public static void main(String[] args) {
		String s = " hello automation testing";
		//reverseWords(s);
		new ReverseWord151().cleanSpaces(s.toCharArray(),s.length());
	}

	
	
	
	 String cleanSpaces(char[] a, int n) {
		    int i = 0, j = 0;
		      
		    while (j < n) {
		      while (j < n && a[j] == ' ') j++;             // skip spaces
		      while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
		      while (j < n && a[j] == ' ') j++;             // skip spaces
		      if (j < n) a[i++] = ' ';                      // keep only one space
		    }
		    return new String(a).substring(0, i);
		    }
		    
		    
	//below is working but beats only 40% of users
	public static String reverseWords(String s){
		String[] str = s.trim().split("\\s+");
		String out = "";
		
		for(int i=str.length-1;i>0;i--) {
			out +=str[i] + " ";
		}
		return out + str[0];
		
	}
	
	
	//below is not exact working --- not working
	private static void reverseWords2(String s) {
		int i=s.length();
		String answer = "";
		for(int k=s.length()-1;k>=0;k--) {
			if(s.charAt(k)!=' ' && k!=0) {continue;}
			
			if(k==0) {answer += " "+s.substring(k, i);System.out.println(answer);continue;}
			else {
				answer += s.substring(k,i);
				i=k;
				
			}
			
		}
		
		System.out.println(answer);
		
		
	}

}
