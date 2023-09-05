package leetcode;

/*class TreeNode{
	 int val;
	 TreeNode left;
	 TreeNode right;
	 
	 TreeNode(){}
	 TreeNode(int val){this.val = val;}
	 TreeNode(int val, TreeNode left, TreeNode right){this.val=val;this.left=left;this.right=right;}
}*/

public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode p = null;
		TreeNode q = null;
		isSameTree(p, q);

	}

	private static boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val == q.val)
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        else 
            return false;
		
		
	}

}
