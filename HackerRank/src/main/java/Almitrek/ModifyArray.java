package Almitrek;

import java.util.Arrays;

/* Given an array of integers, the cost to change an element is the absolute difference between its initial value and its new value, for Example,
 * if the element is initially 10 it can be changed to 7 and 13 for a cost of 3. Determine the minimum cost to sort the array either
 * ascending or descending along its length
 * TCs
 * 
[6, 9, 8, 7, 2, 3, 3]
output: 3
expected output: 1

[5, 1, 2, 3, 3, 4]
output: 1
expected output: 0

Example n=6, arr =[0,1,2,5,6,5,7] 

* only arr[5] = 5 violates the order of ascending sort
* if the value 5 is increased to 6 the array will be sorted in ascending order [0,1,2,3,4,5,6,6,7]
* the cost is arr[5] - arr[5] = 5-6 =1
* 
* modifyArray(){
* }
 */

/* muddasir bhai
 * public static long modifyArray(List<Integer> arr) {
        int n = arr.size();
        long increasingCost = 0;
        long decreasingCost = 0;

        for (int i = 1; i < n; i++) {
            if (arr.get(i) <= arr.get(i - 1)) {
                increasingCost += arr.get(i - 1) - arr.get(i) + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) <= arr.get(i + 1)) {
                decreasingCost += arr.get(i + 1) - arr.get(i) + 1;
            }
        }

        return Math.min(increasingCost, decreasingCost);
    }
 */

public class ModifyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {6,9,8,7,2,3,3};
        int minAscendingCost = minimumSortCost(arr, true);
       // int minDescendingCost = minimumSortCost(arr, false);
        
        System.out.println("Minimum cost for ascending order: " + minAscendingCost);
       // System.out.println("Minimum cost for descending order: " + minDescendingCost);
        
	}
	
	
	 public static int minimumSortCost(int[] arr, boolean ascending) {
	        int[] sortedArr = Arrays.copyOf(arr, arr.length);
	        Arrays.sort(sortedArr);

	        int cost = 0;
	        for (int i = 0; i < arr.length; i++) {
	            cost += Math.abs(arr[i] - sortedArr[i]);
	        }

	        return cost;
	    }
	
	
	

}
