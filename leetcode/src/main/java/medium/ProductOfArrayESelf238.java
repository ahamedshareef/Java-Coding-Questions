package medium;

public class ProductOfArrayESelf238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		productExceptSelf4(new int[] {1,2,3,4});

	}
	
	 public static int[] productExceptSelf4(int[] nums) {
		 int n = nums.length;
		 int pre[] = new int[n];
		 int suf[] = new int[n];
		 
		 pre[0] = 1;
		 suf[n-1] = 1;
		 
		 for(int i=1;i<n;i++) {
			 pre[i] = pre[i-1]*nums[i-1];
		 }
		 for(int i=n-2;i>=0;i--){
			 suf[i] = suf[i+1]*nums[i+1];
		 }
		 
		 int ans[] = new int[n];
	        for(int i = 0; i < n; i++) {
	            ans[i] = pre[i] * suf[i];
	        }
	        
	        
	        return ans;
		 
		 
	 }
	 
	 
	
	
	//below is O(n2) hence timelimite is exceeded
    public int[] productExceptSelf3(int[] nums) {
       int n=nums.length;
       int op[] = new int[n];
       
       for(int i=0;i<n;i++) {
    	   int product =1;
    	   for(int j=0;j<n;j++) {
    		   if(i==j) continue;
    		   product *=nums[j];
    	   }
    	   op[i] = product;
       }
       return op;
        }
    
    public int[] productExceptSelf2(int[] nums) {
    	int n = nums.length;
    	int ans[] = new int[n];
    	int product =1;
    	
    for(int i: nums) {
    	product *=i;
    }
    
    for(int i=0;i<n;i++) {
    	ans[i] = product/nums[i];
    }
    
    return ans;
    	
    }
    
 

}
