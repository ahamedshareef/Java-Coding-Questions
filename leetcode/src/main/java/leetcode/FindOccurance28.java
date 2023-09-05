package leetcode;

public class FindOccurance28 {

	public static void main(String[] args) {
		String haystack = "iadbutsad", needle = "sad";
		
		System.out.println(strStr(haystack,needle));

	}
	
	
	    public static int strStr(String haystack, String needle) {
	    	int haystacklen = haystack.length();
	    	int needlelen = needle.length();
	    	
	        if(!haystack.contains(needle) || haystacklen< needlelen) {
	        	return -1;
	        }
	       
	       for(int i=0;i<=haystacklen-needlelen;i++) {
	    	   int j=0;
	    	   while(j<needlelen && haystack.charAt(i+j)==needle.charAt(j)) {
	    		   j++;
	    	   }
	    	   
	    	   if(j==needlelen) return i;
	       }
	        
	        
	        return -1;
	        
	        
	    }
	

}
