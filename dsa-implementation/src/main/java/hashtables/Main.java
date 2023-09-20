package hashtables;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashTable myHashTable = new HashTable();
		 myHashTable.set( "nails", 100);
		 myHashTable.set( "tile", 50);
		 myHashTable.set( "lumber", 80);
		 
		 myHashTable.set( "bolts", 200);
		 myHashTable.set( "screws", 140);

	     myHashTable.printTable();
	     
	     System.out.println(myHashTable.get("bolts"));
	     
	     System.out.println(myHashTable.keys());
	     
	     int[] a = {1,2,3};int[] b = {4,5,3};
	     System.out.println(myHashTable.itemInCommon(a,b));
	     
	     
	     int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
	     List<Integer> duplicates = myHashTable.findDuplicates(nums);
	     System.out.println(duplicates); 
	     
	     
	     String str = "leetcode";
	     System.out.println(myHashTable.firstNonRepeatingChar(str));
	     
	     
	     System.out.println(str.indexOf('e'));
	     System.out.println(str.lastIndexOf('e'));
	     
	     System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>");
	     
	     //s.indexOf (s.charAt9(i),s.indexOf(s.charAt()i)+1) ==-1
	     String[] strs = {"eat","tea","tan","ate","nat","bat"};
	     System.out.println(myHashTable.groupAnagrams(strs));
	     

	}

}
