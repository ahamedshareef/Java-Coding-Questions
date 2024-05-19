package taib.EssentialsCoding11;

public class Array1DRotation {

	public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
        // isRotation(array1, array2a) should return false.
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        // isRotation(array1, array2b) should return true.
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        // isRotation(array1, array2c) should return false.
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        // isRotation(array1, array2d) should return false.
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        // isRotation(array1, array2e) should return false.
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        // isRotation(array1, array2f) should return true.
    }
	
	// Implement your solution below.
    public static Boolean isRotation(int[] array1, int[] array2) {
    	int len1 = array1.length;
    	int len2 = array2.length;
    	if(len1 != len2) return false;
    	
    	int key_i =-1;
    	int FstElement = array1[0];
    	
    	for(int i=0;i<len2;i++) {
    		if(array2[i]==FstElement)
    			{key_i = i;
    		break;}
    	}
    	if(key_i ==-1) return false;
    	
    	for(int i=0;i<len1;i++) {
    		int j = (key_i + i) % len1;
    		if(array1[i]!=array2[j])
    			return false;
    	}
    	
    	return true;
    	
    }


}
