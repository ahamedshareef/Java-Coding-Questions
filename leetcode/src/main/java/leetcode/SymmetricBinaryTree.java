package leetcode;

public class SymmetricBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = null;
		isSymmetric(root);
	}

	private static boolean isSymmetric(TreeNode root) {
		
		if(root==null) return true;
		return isMirror(root.left,root.right);
		 
		
	}

	private static boolean isMirror(TreeNode left, TreeNode right) {
		if(left==null && right==null) return true;
		if(left==null || right==null) return false;
		return left.val == right.val && isMirror(left.right,right.left) && isMirror(left.left,right.right);
		
	}

}
