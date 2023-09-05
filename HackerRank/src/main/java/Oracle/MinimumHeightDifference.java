package Oracle;

import java.util.*;

public class MinimumHeightDifference {
    public static void main(String[] args) {
        int[] lineA = {4,3,5,6,6};
        int[] lineB = {4,3,5,3,3};
        
        int minCost = findMinCostToEqualize(lineA, lineB);
        
        if (minCost == -1) {
            System.out.println("It's not possible to make the lines equal.");
        } else {
            System.out.println("Minimum cost to make lines equal: " + minCost);
        }
        
       
    }

    public static int findMinCostToEqualize(int[] lineA, int[] lineB) {
        if (lineA.length != lineB.length) {
            return -1; // Unequal number of students, not possible to make equal.
        }
        
       int minCost = 0;
       //int minDiff = Integer.MAX_VALUE;

        int n = lineA.length;
        
        for(int i=0;i<n;i++) {
        	
            Arrays.sort(lineA);
            Arrays.sort(lineB);//,Collections.reverseOrder()
            reverse(lineA);
            reverse(lineB);
            System.out.println(Arrays.toString(lineA));
            System.out.println(Arrays.toString(lineB));
            
            if (lineA[i] == lineB[i]) {
                continue; // No cost to swap equal heights.
            }
            else {
            	int temp = lineA[i];
        		lineA[i] = lineB[i];
        		lineB[i] = temp;
        		
        		minCost += Math.min(lineA[i],lineB[i] );
            }
 
        }
        
        if(sumOfArray(lineA) == sumOfArray(lineB)) {
        	return minCost;
        }
        
        return -1;
    }
    
	public static int sumOfArray(int[] arr){
    	int sum = 0;
    	for(int a:arr) {
    		sum +=a;
    	}
		return sum;
    	
    }
	
	
	public static void reverse(int[] array)
    {
 
        // Length of the array
        int n = array.length;
 
        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {
 
            // Storing the first half elements temporarily
            int temp = array[i];
 
            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
 
            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }
	
}