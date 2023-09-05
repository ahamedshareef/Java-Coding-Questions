package leetcode;

public class InvertTree {

	public static void main(String[] args) {
		TreeNode root = null;
		invertTree(root);

	}

	private static TreeNode invertTree(TreeNode root) {
		if(root == null || ( root.left==null && root.right==null)) return root;
		else
		{
			TreeNode tempNode = root.left;
			root.left = root.right;
			root.right= tempNode;
			
		}
		invertTree(root.left);
		invertTree(root.right);
		return root;
		
	}

}
