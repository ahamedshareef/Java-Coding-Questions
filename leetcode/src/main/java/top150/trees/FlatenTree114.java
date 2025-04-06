package top150.trees;

public class FlatenTree114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private TreeNode prev = null;
	
	public void flatten(TreeNode root) {
		
		if(root == null) return;
		TreeNode right = root.right;
		TreeNode left = root.left;
		
		if(prev !=null) {
			prev.right = root;
			prev.left = null;
		}
		
		prev = root;
		
		flatten(left);
		flatten(right);
		
        
    }


}
