package trees;

/*
 * Full - each node has 0 or 2 nodes
 * Perfect - All levels are full 
 * Complete - trees which are filled from left to right with even without 2 nodes
 * Child 
 * Siblings 
 * Child can also be parents
 * Leaf, Root
 */

/*
 * BST
 * lesser than goes left, greater than goes to right.
 * 
 * worst case is o(n) for lookup if you have straight line like Array
 * 
 * in general for lookup trees are better than ArrayList
 * remove - trees are better than array
 * insert array is better
 */
public class BinarySearchTree {
	 Node root;
	
	class Node{
		int value;
		Node left;
		Node right;
		
		Node(int value){
			this.value = value;
		}
	}
	
	public boolean insert(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;

		while (true) {
			if (newNode.value == temp.value)
				return false;
			if (newNode.value < temp.value) {
				if (temp.left == null) {
					temp.left = newNode;
					return true;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}

		}
	}
	
	public boolean contain(int value) {
		if (root == null)
			return false;

		Node temp = root;

		while (temp != null) {

			if (value < temp.value) {
				temp = temp.left;

			} else if (value > temp.value) {
				temp = temp.right;

			} else {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * // this is also not required. as creating any instance for this calls will
	 * //instantiate to Null. public BinarySearchTree() { root = null; }
	 * 
	 * // below is not required as we can do it using insert method. public
	 * BinarySearchTree(int value) { Node newNode = new Node(value); root = newNode;
	 * }
	 */
	

}
