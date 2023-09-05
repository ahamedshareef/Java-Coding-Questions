package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger13 {
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		System.out.println(romanToInt("XII"));
		
		

	}
	
	 public static int romanToInt(String s) {
	 int answer=0, current=0, prev=0;
	 
	 for(int i=s.length()-1;i>=0;i--) {
		 switch(s.charAt(i)) {
		 
		 case 'I': current=1;break;
		 case 'V': current=5;break;
		 case 'X': current=10;break;
		 case 'L': current=50;break;
		 case 'C': current=100;break;
		 case 'D': current=500;break;
		 case 'M': current=1000;break;
		 }
		 
		 if(current<prev) {
			 answer -= current;
		 }else {
			 answer += current;
		 }
		 prev =current;
	 }
	 return answer;
		 
	 }
	 public static int romanToInt2(String s) {
		  	Map<Character,Integer> mp = new HashMap<>();
		    mp.put('I',1);
			mp.put('V',5);
			mp.put('X',10);
			mp.put('L',50);
			mp.put('C',100);
			mp.put('D',500);
			mp.put('M', 1000);
		
			int answer =0;
			
		for(int i=0;i<s.length();i++){
			
			if(i<s.length()-1 && (mp.get(s.charAt(i)) < mp.get(s.charAt(i + 1))))
					answer -= mp.get(s.charAt(i));
			else
				answer += mp.get(s.charAt(i));
		
		
		}
		return answer;
	        
	    }

}
