package leetcode;

public class CompareVersion165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version1= "1.01";
		String version2= "1.001";
		
		System.out.println(new CompareVersion165().compareVersion(version1, version2));

	}
	
	 public int compareVersion(String version1, String version2) {
		   int i=0,j=0,n1,n2;
	        int len1 = version1.length();
	        int len2 = version2.length();
	        
	        
	        while(i<len1 || j<len2) {
	        	n1=0;n2=0;
	        	while(i<len1 && version1.charAt(i) !='.') {
	        		n1 = n1*10 +(version1.charAt(i) - '0');
	        		System.out.println("N1 "+n1);
	        		i++;
	        	}
	        	while(j<len2 && version2.charAt(j) !='.') {
	        		n2 = n2*10 +(version2.charAt(j) - '0');
	        		System.out.println("N2 "+n2);
	        		j++;
	        	}
	        	
	        	if(n1<n2) return -1;
	        	else if (n1>n2) return 1;
	        	else {
	        	i++;j++;}
	        }
	        return 0;
	        
	    }
	 
} 
/*
 * public int compareVersion2(String version1, String version2) { int temp1 =
 * 0,temp2 = 0; int len1 = version1.length(),len2 = version2.length(); int i =
 * 0,j = 0; while(i<len1 || j<len2) { temp1 = 0; temp2 = 0; while(i<len1 &&
 * version1.charAt(i) != '.') { temp1 = temp1*10 + version1.charAt(i++)-'0';
 * 
 * } while(j<len2 && version2.charAt(j) != '.') { temp2 = temp2*10 +
 * version2.charAt(j++)-'0';
 * 
 * } if(temp1>temp2) return 1; else if(temp1<temp2) return -1; else { i++; j++;
 * 
 * }
 * 
 * } return 0;
 * 
 * }
 */
