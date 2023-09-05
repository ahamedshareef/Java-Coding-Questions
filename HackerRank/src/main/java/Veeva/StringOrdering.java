package Veeva;

import java.util.Arrays;

public class StringOrdering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark"};
		
	//System.out.println(Arrays.toString(ArrangeAZorder(str)));
	System.out.println(Arrays.toString(ArrangeByLength(str)));
	

	}

	private static String[] ArrangeByLength(String[] str) {
		
		
			
			Arrays.sort(str,(o1,o2)->{
				int res = o1.length()-o2.length();
				return res;
			});
			
			
			return str;
		
		
	}

	private static String[] ArrangeAZorder(String[] str) {
		
		for(int i=0;i<str.length-1;i++) {
			
			for(int j=i+1;j<str.length;j++) {
				
				if(str[i].compareTo(str[j])>0) {
					String temp = str[i];
					str[i] = str[j];
					str[j]=temp;
				}
			}
		}
		
		return str;
		
		
	}
	
	

}
