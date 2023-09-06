package leetcode;

public class isSubsequence392 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s= "abc";
	String t= "anbgdc";
	System.out.println(isSubsequence(s,t));
		

	}
	
	
public static boolean isSubsequence(String s, String t) {
    
    int i=0;
    int j=0;
    if(s.length()>t.length()) return false;
    
    while(i<s.length() && j<t.length()) {
    	if(s.charAt(i)==t.charAt(j)) 
    		i++;
    	j++;
    }
    
    return i==s.length();
    }

}
