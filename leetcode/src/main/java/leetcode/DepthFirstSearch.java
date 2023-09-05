package leetcode;


//  Definition for a binary tree node.

/* class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 */
 class TreeNode{
	 int val;
	 TreeNode left;
	 TreeNode right;
	 
	 TreeNode(){}
	 TreeNode(int val){this.val = val;}
	 
	 TreeNode(int val, TreeNode left, TreeNode right){this.val=val;this.left=left;this.right=right;}
 }



public class DepthFirstSearch {

	public static void main(String[] args) {
		TreeNode node = null;
        maxDepth( node);
	}

	private static int maxDepth(TreeNode root) {
		if(root == null) return 0;
		int leftHeight = maxDepth(root.left);
		int rightHeight = maxDepth(root.right);
		return 1+ Math.max(leftHeight, rightHeight);
		
		
		// TODO Auto-generated method stub
		
		
	}

}
