package top150.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView199 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	   public List<Integer> rightSideView(TreeNode root) {
		   List<Integer> result = new ArrayList<Integer>();
		   if (root == null) return result;
		   
		   
		   Queue<TreeNode> queue = new LinkedList<>();
		   queue.offer(root);
		   
		   while(!queue.isEmpty()) {
			   int size= queue.size();
			   TreeNode rightNode = null;
			   
			   
			   for(int i=0;i<size;i++) {
				   TreeNode currentNode  = queue.poll();
				   rightNode = currentNode;
				   
				   if(currentNode.left != null) queue.offer(currentNode.left);
				   if(currentNode.right != null) queue.offer(currentNode.right);
			   }
			  result.add(rightNode.val);
		   }
		   
	       return result; 
	    }

}
