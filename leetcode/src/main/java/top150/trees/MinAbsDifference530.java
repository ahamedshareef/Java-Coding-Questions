package top150.trees;

public class MinAbsDifference530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int minDiff = Integer.MAX_VALUE;
	TreeNode prev;
	
	 	public int getMinimumDifference(TreeNode root) {
		
		 
		 inorder(root);
		 return minDiff;
		 
		 
		
	        
	    }


	private void inorder(TreeNode root) {
		if(root == null) return;
		inorder(root.left);
		if(prev !=null) {minDiff = Math.min(minDiff, root.val - prev.val);}
		prev =  root;
		inorder(root.right);

	}

}
