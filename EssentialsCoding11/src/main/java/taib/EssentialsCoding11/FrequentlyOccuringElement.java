package taib.EssentialsCoding11;

import java.util.HashMap;
import java.util.Map;

public class FrequentlyOccuringElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        mostFreqent(array1);

	}
	
	 public static int mostFreqent(int[] givenArray) {
	        int maxItem = 0;
	        int maxCount = 0;
	        Map<Integer,Integer> mp = new HashMap<>();
	        
	        for(int a:givenArray) {
	        	
	        	int newVal = mp.getOrDefault(a, 0) + 1;
	        	mp.put(a, newVal);
	        	
	        	if(mp.get(a) > maxCount) {
	        		maxCount = mp.get(a);
	        		maxItem = a;
	        	}
	        }
	        
	        return maxItem;
	    }

}
