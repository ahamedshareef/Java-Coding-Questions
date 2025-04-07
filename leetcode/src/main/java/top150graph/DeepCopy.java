package top150graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


public class DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	 public Node cloneGraph(Node node) {
	        if(node == null) return null;
	        
	        // key is current graph and value is cloned graph node
	        HashMap<Node,Node> visited = new HashMap<>();
	        return dfs(node,visited);
	        
	        
	    }


	private Node dfs(Node node, HashMap<Node, Node> visited) {
		
		if(visited.containsKey(node))
		{
			return visited.get(node);
		}
		
		
		Node clone = new Node(node.val); // Create clone of current node (without neighbors yet)
		visited.put(node, clone); // Add to mapping before DFS to handle cycles
		
		for(Node neighbour: node.neighbors) {
			clone.neighbors.add(dfs(neighbour,visited));  // creating the list of neighbours Adjecency list./
		}
		
		return clone;
	}
}
