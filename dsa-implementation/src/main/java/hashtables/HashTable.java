package hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTable {
	
	private int size =7;
	private Node[] dataMap;
	
	public HashTable() {
		dataMap = new Node[size];
	}
	
	class Node{
		String key;
		int value;
		Node next;
		
		public Node(String key, int value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public void printTable() {
		
		for(int i=0;i<dataMap.length;i++) {
			
			if(dataMap[i] !=null) {
			Node temp = dataMap[i];
			while(temp !=null) {
				
				System.out.print(i +": " +" { " +temp.key +"= " +temp.value +"} ");
				temp = temp.next;
			}
			System.out.println();
		}
		
		}
	}
	
	private int hash(String key) {
		int hash = 0;
		char[] chars = key.toCharArray();

		for (char c : chars) {
			int asciiVal = c;
			hash = (hash + asciiVal * 23) % dataMap.length;
		}

		return hash;

	}
	
	public void set(String key, int value) {
		int index = hash(key);
		Node newNode = new Node(key, value);
		if (dataMap[index] == null) {
			dataMap[index] = newNode;
		} else {
			Node temp = dataMap[index];
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public int get(String key) {
		int index = hash(key);
		Node temp = dataMap[index];
		if(temp == null) return 0;
		else {
			while(temp !=null) {
				if(temp.key == key)
					return temp.value;
				temp = temp.next;
			}
			
		}
		return 0;
	}
	
	public ArrayList keys() {
		ArrayList<String> allKeys = new ArrayList<>();
		
		for(int i=0 ; i< dataMap.length;i++) {
			Node temp = dataMap[i];
			
			while(temp != null) {
				allKeys.add(temp.key);
				temp = temp.next;
			}
			
		}
		
		return allKeys;
		
	}
	
	public boolean itemInCommon(int[] a1, int[]a2) {
		HashMap<Integer,Boolean> mp = new HashMap<Integer,Boolean>();
		
		for(int a:a1) {
			mp.put(a, true);
		}
		
		System.out.println(mp);
		
		for(int a:a2) {
			if(mp.get(a) !=null) return true;
		}
		
		return false;
		
	}

	public List<Integer> findDuplicates(int[] nums) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		List<Integer> lst = new ArrayList<Integer>();
		
		for(int n:nums) {
			if(mp.get(n)== null)
				mp.put(n, 1);
			else {
				if(!lst.contains(n))
				lst.add(n);
			}
		}
		Collections.sort(lst);
		
		return lst;
	}
	
	
	public void iterateMap(){
		Map<Integer, Integer> mp = new HashMap<>();
		 List<Integer> duplicates = new ArrayList<>();
		
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
		}
            
	}
	
	public Character firstNonRepeatingChar(String str) {
		
		Map<Character, Integer> mp = new HashMap<>();
		
		for(char c: str.toCharArray()) {
			if(mp.get(c)==null) {mp.put(c, 1);}
			else  {
				mp.put(c, mp.get(c)+1);
			}
			
		
		}
		
		for(char c:str.toCharArray()) {
			if(mp.get(c)==1) return c;
		}
		return null;
		
		
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
		if(strs == null || strs.length ==0) return new ArrayList<>();
		
		Map<String, List<String>> mp = new HashMap<>();
		
		for (String s:strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			//changing back to string
			String keyStr = String.valueOf(ch);
			System.out.println(keyStr);
			
			if (!mp.containsKey(keyStr)) 
				mp.put(keyStr, new ArrayList<String>());
			
            mp.get(keyStr).add(s);
		}
		System.out.println(mp);
		
		
		return new ArrayList<>(mp.values());
    }
	
	public int[] twoSum(int[] nums, int target) {
		
		int[] result = new int[2];
		if(nums.length < 1) return result;
		Map<Integer,Integer> mp = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++) {
			int reminder = target - nums[i];
			if(mp.containsKey(reminder)) {
				result[0] = mp.get(reminder);
				result[1] = i;
				break;
				//return new int[]{mp.get(reminder),i};
			}else 
			{
				mp.put(nums[i], i);
			}
		}
		
		return result;
		// return new int[]{};
		
	}
	
	
	public int[] subarraySum(int[] nums, int target) {
		//int[] result = new int[2];
		Map<Integer,Integer> sumIndex = new HashMap<>();
		int currentSum =0;
		sumIndex.put(0, -1);
		for(int i=0;i<nums.length;i++) {
			currentSum+= nums[i];
			if(sumIndex.containsKey(currentSum - target)) {
				return new int[] {sumIndex.get(currentSum-target),i};
			}
			sumIndex.put(currentSum, i);
		}
		
		return new int[]{};
		
	}
	

}
