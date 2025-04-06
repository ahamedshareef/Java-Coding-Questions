package top150.trees;

public class PathSum112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) return false;
		
		if(root.left == null && root.right == null && sum-root.val == 0) return true;
		return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right,sum-root.val);
		
	}

}
