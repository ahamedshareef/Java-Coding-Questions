package taib.EssentialsCoding11;

import java.util.ArrayList;

public class CommonElementIn2SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// NOTE: The following input values are used for testing your solution.

        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        // commonElements(array1A, array2A) should return [1, 4, 9] (an array).

        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        // common_elements(array1C, array2C) should return [] (an empty array).

	}
	
	// Implement your solution below.
    // NOTE: Remember to return an Integer array, not an int array.
    public static Integer[] commonElements(int[] array1, int[] array2) {
        	ArrayList<Integer> resultInList = new ArrayList<>();
        
        	int i=0,j=0;
        	while(i< array1.length && j <array2.length) {
       
        		if(array1[i] == array2[j]) {
        			resultInList.add(array1[i]);
        			i++; j++;}
        		else if(array1[i]< array2[j]) {
        			i++;
        		}else {
        			j++;
        		}
        		
        		 
    }
        	
        Integer[] resultInArray = new Integer[resultInList.size()];
   		 return resultInList.toArray(resultInArray);
        	
        	
    }

}
