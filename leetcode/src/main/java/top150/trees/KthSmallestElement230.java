package top150.trees;

import java.util.Stack;

public class KthSmallestElement230 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int kthSmallest(TreeNode root, int k) {
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = root;
		int count =0;
		
		// Iterative in-order traversal
		
		while(current !=null || !stack.isEmpty()) {
			
			
			while(current!=null) {
				stack.push(current);
				current= current.left;
			}
			
			// when you pop least add 1/
			current = stack.pop();
			count ++;
			
			if(count == k) // If we've found the kth element, return it
				return current.val;
			// Move to the right subtree
			current = current.right;
		}
				
		return -1;
        
   }



}
