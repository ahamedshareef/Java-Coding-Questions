package trees;

class Node{
	Node leftNode;
	Node rightNode;
	int data;
	Node(int data){
		this.data = data;
	}
	
	/*
	 * class Node {
    int key;
    Node left, right;
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
	 */
	public void insert(int value) {
		if(value <= data) {
			if(leftNode == null) {
				leftNode = new Node(value);
			} else {
				leftNode.insert(value);
			}
		} else {
			if (rightNode == null) {
				rightNode = new Node(value);
			}else {
				rightNode.insert(value);
			}
		}
		
	}
	
	public boolean contains (int value) {
		if(value == data) {return true;}
		else if(value < data) {
			if(leftNode == null) {
				return false;
			}else {
				return leftNode.contains(value);
			}
		}
		
		else {
			if (rightNode == null) {return false;}
			else {return rightNode.contains(value);}
		}
		
	}
	
	
	public void printInorder() {
		if (leftNode != null) {leftNode.printInorder();}
		System.out.println(data);
		if(rightNode != null) {rightNode.printInorder();}
	}
	
	
	
}

public class TreeOperations {
	//public static void
	Node a = new Node(1);
	
}
