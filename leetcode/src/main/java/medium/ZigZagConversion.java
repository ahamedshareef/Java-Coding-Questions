package medium;

public class ZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "PAYPALISHIRING";
		System.out.println(convert(str,3));
		
	}
	
    public static String convert(String s, int numRows) {
    	
    	char[] ch = s.toCharArray();
    	int n= ch.length;
    	StringBuffer[] sb_arr= new StringBuffer[numRows];
    	for(int i=0;i<numRows;i++) {
    		sb_arr[i] = new StringBuffer();
    	}
    	
    	int index =0;
    	
    	while(index<n) {
    	for(int i=0;i<numRows && index<n;i++) {
    		sb_arr[i].append(ch[index++]);
    	}
    	
    	for(int i=numRows-2;i>0 && index<n; i--) {
    		sb_arr[i].append(ch[index++]);
    		
    	}
    		
    	}
    	
    	StringBuffer result = sb_arr[0];
    	for(int i=1;i<numRows;i++)
    		result.append(sb_arr[i].toString());
    	
    	return result.toString();
    	
        
    }
	
	
	

}
