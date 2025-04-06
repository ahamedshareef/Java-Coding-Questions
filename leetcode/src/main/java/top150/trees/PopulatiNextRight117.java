package top150.trees;

public class PopulatiNextRight117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public Node connect(Node root) {
	Node head = null; //head of the next level
    Node prev = null; //the leading node on the next level
   Node cur = root;  //current node of current level

    while (cur != null) {
        
        while (cur != null) { //iterate on the current level
            //left child
            if (cur.left != null) {
                if (prev != null) {
                    prev.next = cur.left;
                } else {
                    head = cur.left;
                }
                prev = cur.left;
            }
            //right child
            if (cur.right != null) {
                if (prev != null) {
                    prev.next = cur.right;
                } else {
                    head = cur.right;
                }
                prev = cur.right;
            }
            //move to next node
            cur = cur.next;
        }
        
        //move to next level
        cur = head;
        head = null;
        prev = null;
    }
	return cur;
    
}
    

}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }
    
    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
