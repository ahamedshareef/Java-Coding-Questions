package top150.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels637 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
public List<Double> averageOfLevels(TreeNode root) {
	
	 List<Double> result = new ArrayList<>();
     Queue<TreeNode> queue = new LinkedList<>();
	if(root == null) return result;
	
	queue.offer(root);
	
	while(!queue.isEmpty()) {
		int size = queue.size();
		double sum=0.0;
		
		for(int i=0;i< size;i++) {
			TreeNode node= queue.poll();
			sum =+ node.val;
			
		if(node.left !=null)
			queue.offer(node.left);
		if(node.right !=null)
			queue.offer(node.right);
		}
		result.add(sum/size);
		
		
	}
	return result;
	
	
	
        
    }


	
	

}
