package leetcode;

import java.util.Arrays;

public class MergeArrays88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3;
		int n = 3;
		merge(nums1, m, nums2, n);
	}
	
	
	
public static void merge(int[] nums1, int m, int[] nums2, int n){
		
		int i=m-1;
		int j=n-1;
		int k = m+n-1;
		
		while(j>=0) {
			if(i>=0 && nums1[i]>nums2[j]) {
				nums1[k]=nums1[i];
				k--;
				i--;
			}else {
				nums1[k]=nums2[j];
				j--;
				k--;
			}
		}
		
	}

	public static void merge3(int[] nums1, int m, int[] nums2, int n){
		
		for(int i=m-1,j=0;j<n;i--) {
			nums1[i]= nums2[j];j++;
		}
		Arrays.sort(nums1);
		
	}
	
	 private static void swap(int i, int j) {

		 int temp = i;
		 i=j;
		 j=temp;
		 
		
	}




	public static void merge2(int[] nums1, int m, int[] nums2, int n) {
		 
		 int[] fnArr = new int[m+n];
		 
		 int i;
		 int j;
		 int k = m+n-1;
		 
		 for (i = m-1,j=n-1;i<=0 || j<=0;i--,j--) {
			 while(nums1[i] >= nums2[j])
			 {
				 fnArr[k]= nums1[i];
				 k--;
				 
				 
			 }
			 while(nums1[i] < nums2[j]) {
				 fnArr[k]= nums2[j];
				 k--;
			 }
			
			 
		 }
		 
		 if(i!=0) {
				while(i==0) {
					
					fnArr[k] = nums1[i];
					i--;
				} 
			 }
			 
			 if(j!=0) {
					while(j==0) {
						
						fnArr[k] = nums2[j];
						j--;
					} 
			 }
		 
		 
		 for(int y: fnArr)
		 System.out.println(y);
			 
	
		 
		 
	        
	    }

}
