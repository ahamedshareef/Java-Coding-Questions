package leetcode;

public class reverseVowel {

	public static void main(String[] args) {
		

	}
	
	public String reverseVowels(String s) {

        char [] word = s.toCharArray();
        int start =0;
        int end = s.length() -1;
        String Vowels = "aeiouAEIOU";
        
       while(start<end)
       {
        while(start <end && Vowels.indexOf(word[start]) == -1) {
        	start ++;
        	
        }
        
        while (start <end && Vowels.indexOf(word[end]) == -1) {
        	end --;
        	
        }
        
        // Swap
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
        start ++;end--;
        
       }
       
       return new String(word);
       
       
        
    }
	
	
	public int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        
        for(int i=0;i<ch.length;i++) {
     	   if(s.indexOf(ch[i])==-1) {
     		   return i;
     	   }
        }
        
        return -1;
        
    }
    
	
	

}
