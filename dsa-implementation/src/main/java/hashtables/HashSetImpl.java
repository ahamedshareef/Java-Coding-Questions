package hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Set<Integer> set1 = new HashSet<>();
		 
		 set1.add(1);
		 set1.add(2);
		 set1.add(3);
		 set1.add(4);
		 
		 System.out.println(set1);
		 
		 
		 Set<Integer> set2 = new HashSet<>();
		 
		 set2.add(5);
		 set2.add(6);
		 set2.add(7);
		 set2.add(4);
		 
		 System.out.println(set2);
		 
		 Set<Integer> set3 = new HashSet<>(set1);
		 
		 set3.removeAll(set2);
		 
		 System.out.println(set3);
		 
		 
		 List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
		 List<Integer> newList = removeDuplicates(myList);
	        System.out.println(newList);
	        
	        System.out.println(hasUniqueChars("abcdefg")); // should return true
	        System.out.println(hasUniqueChars("hello")); // should return false
	        System.out.println(hasUniqueChars("")); // should return true
	        System.out.println(hasUniqueChars("0123456789")); // should return true
	        System.out.println(hasUniqueChars("abacadaeaf")); // should return false
	        
	        int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {2, 4, 6, 8, 10};
	        int target = 7;  
		 
	        List<int[]> pairs = findPairs(arr1, arr2, target);
	        
	        System.out.println();
	        
	        for (int[] pair : pairs) {
	            System.out.println(Arrays.toString(pair));
	        }
	        
	        
	        int[] nums = {100, 4, 200, 1, 3, 2, 2,1};
	        int longest = longestConsecutiveSequence(nums);
	        System.out.println(longest);
	        

	}

	private static int longestConsecutiveSequence(int[] nums) {

		Arrays.sort(nums);
		ArrayList<Integer> nDup = new ArrayList<>();
		nDup.add(nums[0]);
		for(int i=1;i<nums.length;i++) {
			if(nums[i]!=nums[i-1])
				nDup.add(nums[i]);
		}
		int ans=0; int currentCount=0;
		
		for(int i=0;i<nDup.size();i++) {
			
			if(i>0 && nDup.get(i) == (nDup.get(i-1)+1) )
			currentCount++;
			else
			currentCount=1;
			
			ans = Math.max(ans, currentCount);
		
		}
		return ans;
	}

	private static List<Integer> removeDuplicates(List<Integer> myList) {
		
		Set<Integer> set1 = new HashSet<>(myList);
		System.out.println(set1);
		 List<Integer> lst = new ArrayList<>(set1);
		 return lst;
		
		
		
		
	}
	
	
	private static boolean hasUniqueChars(String s){
		
		Set<Character> set = new HashSet<>();
		
		for(char c: s.toCharArray())
		set.add(c);
		
		return set.size()==s.length();
		
	}
	
	
	public static List<int[]> findPairs(int[] arr1, int[] arr2, int target){
		Set<Integer> set = new HashSet<>();
		List<int[]> pairs = new ArrayList<int[]>();
		
		for(int i:arr1)
			set.add(i);
		
		for(int j:arr2) {
			int reminder = target-j;
			if(set.contains(reminder)) {
				pairs.add(new int[] {reminder,j});
			}
		}
		
		return pairs;
	}

}
