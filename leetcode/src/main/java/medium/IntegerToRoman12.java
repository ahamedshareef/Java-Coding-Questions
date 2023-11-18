package medium;

public class IntegerToRoman12 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(intToRoman2(1546));

	}
	
	
	 public static String intToRoman(int num) {
		 String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		 String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		 String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		 String [] thousand = {"","M","MM","MMM"};
		 
		 String Th = thousand[num/1000];
		 String Hd = hundreds[(num%1000)/100];
		 String T  = tens[(num%100)/10];
		 String O = ones[(num%10)/1];
		 
		 return Th+Hd+T+O;
	 }
	 
	 public static String intToRoman2(int num) {
	 int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	    StringBuilder sb = new StringBuilder();
	   
	    for(int i=0;i<values.length;i++) {
	        while(num >= values[i]) {
	            num -= values[i];
	            sb.append(strs[i]);
	        }
	    }
	    return sb.toString();
	 }
	 
	 

}
