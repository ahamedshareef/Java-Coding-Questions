package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


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
	
	
	
	public List<Integer> inorderTraversal(TreeNode root) {
	      List<Integer> list = new ArrayList<Integer>();
			addNodes(root,list);
		    return list;
	    }

	    public void addNodes(TreeNode root, List<Integer> list){
	        if (root != null) {
	            addNodes(root.left, list);
	            list.add(root.val);
	            addNodes(root.right, list);
	        }
	    }
	    
	    public List<Integer> preorderTraversal(TreeNode root) {
	    	List<Integer> list = new ArrayList<Integer>();
	    	addNode2(root,list);
	    	return list;
	        
	    }

		private void addNode2(TreeNode root, List<Integer> list) {
			
			if(root!=null) {
				list.add(root.val);
				addNode2(root.left,list);
				addNode2(root.right,list);
			}
			
		}
		
		
		public List<List<Integer>> levelOrder(TreeNode root) {
			List<List<Integer>> trlist = new LinkedList<List<Integer>>();
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        
	        
//	        base condition
	        if (root == null) {return trlist;}
	        
	        queue.offer(root);
	        boolean zigzag = false;
	        
	        while(!queue.isEmpty()) {
	        	List<Integer> subList = new LinkedList<Integer>();
	        	int size = queue.size();
	        	
	        	for(int i=0; i<size; i++) {
	        		if(queue.peek().left != null)
	        			queue.offer(queue.peek().left);
	        		if(queue.peek().right != null)
	        			queue.offer(queue.peek().right);
	        		
	        		subList.add(queue.poll().val);
	        	}
	        	if (zigzag)
	        	trlist.add(0,subList);
	        	else trlist.add(subList);
	        }
	        
	        return trlist;
	    }
		
		
		
		public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
			List<List<Integer>> trlist = new LinkedList<List<Integer>>();
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			
			if (root == null) {return trlist;}
			
			while(!queue.isEmpty()) {
				List<Integer> subList = new LinkedList<Integer>();
				int size = queue.size();
				
				for(int i=0; i< size;i ++) {
					
				}
			}
			
			return trlist;
	        
	    }
		
		
		public int minDepth(TreeNode root) {
			
			if (root == null) return 0;
			int leftHeight = minDepth(root.left);
			int rightHeight = minDepth(root.right);
			return 1+Math.min(leftHeight, rightHeight);
	        
	    }
		
		
		public TreeNode invertTree(TreeNode root) {
			if(root == null) return null;
			TreeNode left = invertTree(root.left);
			TreeNode right = invertTree(root.right);
			root.left = right;
			root.right = left;
			return root;
	    }
		
		public TreeNode searchBST(TreeNode root, int val) {
			if(root == null) return null;
			if(root.val == val) return root;
			else return val <= root.val? searchBST(root.left, val): searchBST(root.right, val);
	        
	    }
		
		
		public boolean findTarget(TreeNode root, int k) {
			HashSet<Integer> hs = new HashSet<Integer>();
			if(root == null) return false;
			int diff = k- root.val;
			if(hs.contains(diff)) return true;
			else hs.add(root.val);
			return findTarget(root.left,k) ||findTarget(root.right,k);
			
	        
	    }
		
		int result;
		public int rangeSumBST(TreeNode root, int low, int high) {
			
			if(root == null) return 0;
			if(root.val <= low) result += root.val;
			else if (root.val >= high) result += root.val;
				
			int left = rangeSumBST(root.left,low,high);
			int right = rangeSumBST(root, low, high);
			
			return root.val + result;
	        
	    }
		
		
		public int countNodes(TreeNode root) {
			
			int height = 0;
			while(root.left != null && root.right != null)
			{
				if(root.right !=null) {height++;}
				if(root.right == null && root.left != null) {root=root.left; height++;}
			}
			return 2^height;
	    }
		
		
}

	
	
	
