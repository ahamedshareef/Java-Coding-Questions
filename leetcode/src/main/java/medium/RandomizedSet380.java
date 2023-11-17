package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomizedSet380 {

    List<Integer> nums;
    Map<Integer, Integer> idxMap;
    Random random;

    public RandomizedSet380() {
        nums = new ArrayList<>();
        idxMap = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (idxMap.containsKey(val)) {
            return false;
        }

        idxMap.put(val, nums.size());
        nums.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!idxMap.containsKey(val)) {
            return false;
        }

        int idx = idxMap.get(val);
        int lastIdx = nums.size() - 1;
        if (idx != lastIdx) {
            int lastVal = nums.get(lastIdx);
            nums.set(idx, lastVal);
            idxMap.put(lastVal, idx);
        }
        nums.remove(lastIdx);
        idxMap.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
    
    
    public static void main(String args[]) {
    	
    	 RandomizedSet380 obj = new RandomizedSet380();
    	 boolean param_1 = obj.insert(1);
    	 boolean param_2 = obj.insert(2);
    	 boolean param_3 = obj.insert(4);
    	 boolean param_4 = obj.insert(5);
    	 boolean param_5 = obj.insert(3);
    	 boolean param_6 = obj.remove(2);
    	 int param_7 = obj.getRandom();
    	 
    }
}