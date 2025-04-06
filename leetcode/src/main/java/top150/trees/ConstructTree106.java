package top150.trees;

import java.util.HashMap;
import java.util.Map;

public class ConstructTree106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //https://www.youtube.com/watch?v=LgLRTaEMRVc

	}
	
	 public TreeNode buildTree(int[] inorder, int[] postorder) {
		 Map<Integer, Integer> mp = new HashMap<>();
		 
		 for(int i=0;i<inorder.length;i++) {
			 mp.put(inorder[i], i);
		 }
		 
		 
		 TreeNode root = buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,mp);
		 return root;
 
	    }

	private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd, Map<Integer, Integer> mp) {
		
		
		if(postStart > postEnd || inStart > inEnd) return null;
		
		TreeNode root = new TreeNode(postorder[postEnd]);
		int inRoot = mp.get(postorder[postEnd]);
		int numsLeft = inRoot- inStart;
		
		root.left = buildTree(inorder,inStart, inRoot-1, postorder,postStart,postStart+numsLeft-1,mp);
		root.right = buildTree(inorder,inRoot+1, inEnd,postorder,postStart+numsLeft,postEnd-1,mp);
		
		
		return root;
	}
	 

}
