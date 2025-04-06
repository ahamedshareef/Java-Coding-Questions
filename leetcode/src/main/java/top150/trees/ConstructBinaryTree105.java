package top150.trees;

import java.util.HashMap;
import java.util.Map;


// Solution: https://www.youtube.com/watch?v=aZNaLrVebKQ


class TreeNode{
	 int val;
	 TreeNode left;
	 TreeNode right;
	 
	 TreeNode(){}
	 TreeNode(int val){this.val = val;}
	 
	 TreeNode(int val, TreeNode left, TreeNode right){this.val=val;this.left=left;this.right=right;}
}

public class ConstructBinaryTree105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 

	}
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		
		
		for(int i=0; i<inorder.length;i++) {
			mp.put(inorder[i], i);
		}
		
		TreeNode root = buildTree(preorder,0,preorder.length-1, inorder,0,inorder.length-1,mp);
		return root;
        
    }

	private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,Map<Integer, Integer> inMp) {
		
		if(preStart > preEnd || inStart > inEnd) return null;
		
		TreeNode root = new TreeNode(preorder[preStart]);
		
		int inRoot = inMp.get(preorder[preStart]);
		int numsLeft = inRoot-inStart;
		
		root.left = buildTree(preorder,preStart+1,preStart+numsLeft,inorder,inStart,inRoot-1,inMp);
		root.right = buildTree(preorder,preStart+1+numsLeft,preEnd,inorder,inRoot+1,inEnd,inMp);
		
		return root;
		
		
	
	}
	
	

}
