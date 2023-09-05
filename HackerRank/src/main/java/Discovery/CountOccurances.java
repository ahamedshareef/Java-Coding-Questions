package Discovery;

import java.util.HashMap;
import java.util.Map;

public class CountOccurances {

	public static void main(String[] args) {
		String count = "This is Ahamed";
		System.out.println(countOcc(count));

	}

	private static HashMap<String,Integer> countOcc(String count) {
		HashMap<String,Integer> mp = new HashMap<>();
		String[] words = count.split("\\s+");
		for(String word:words) {
			Integer integer = mp.get(word);
			if(integer ==null) {mp.put(word, 1);}
			else {mp.put(word, integer+1);}
		}
		
		return mp;
	}

}
