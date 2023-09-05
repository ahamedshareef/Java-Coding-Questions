package Almitrek;

import java.util.Arrays;
import java.util.Comparator;


public class ArrangeWords {
	
	/* arrange in ascending order 1st camel case and ending with period
	 * 
	 * ip : Cats and hats.
	 * op : And cats hats.
	 * 
	 * [A-Z][a-z]*\.$.
	 * 1. Each word is order by lendth, ascending.
	 * Workds of equal lendth must appear in the same order as in the original sentence
	 * the rearranged sentences must be formateed to satisfy the regular exp: ^[A-Z][a-z]*\.$
	 */

	public static void main(String[] args) {
		
		
		String str = "Cats sharee and hats ahamed.";
		
		System.out.println(rearrange(str));

	}

	private static String rearrange(String str) {
		str = str.substring(0,str.length()-1).toLowerCase();
		String[] words = str.split("\\s+", 0);
		//Arrays.sort(words,new LenghtComparator());
		
		Arrays.sort(words,(o1, o2)->{
			int res = o1.length() - o2.length();
			return res == 0 ? 1 : res;
		});
		
		words[0] = words[0].substring(0,1).toUpperCase() + words[0].substring(1);
		words[words.length-1] += ".";
		String answer = String.join(" ", words);
		return answer;
	}
	
	

}

class LenghtComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int result = Integer.compare(o1.length(),o2.length());
		// for equal length swap in original order
		if(result ==0) {
			return 1;
			}
		return result;
	}
	
}
