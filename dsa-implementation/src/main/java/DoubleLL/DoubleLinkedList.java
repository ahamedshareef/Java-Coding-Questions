package DoubleLL;

import DoubleLL.DoubleLinkedList.Node;

public class DoubleLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}

	}

	DoubleLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	/*
	 * Append to the end
	 */

	public void append(int value) {
		Node newNode = new Node(value);

		if (length == 0) {
			head = newNode;
			tail = newNode;

		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}

		length++;

	}
	
	/*
	 * Remove Last, edge case when we have 0 items, when we have 1 items.
	 */
	
	public Node removeLast() {

		if (length == 0)
			return null;
		
		Node temp = tail;
		
		if (length == 1) {
			head = null;
			tail = null;
		}
		else {
		tail = tail.prev;
		tail.next = null;
		temp.prev = null;
		length--;
		}
		
		return temp;

	}
	
	
	
	/*
	 * Prepend Node.
	 */
	
	
	public void addFirst(int value) {
		
	//	Node temp = null;
		Node myNode= new Node(value);
		
		if(length == 0) {
			head= myNode;
			tail = myNode;
		}
		else {
			
			myNode.next = head;
			head.prev = myNode;
			head = myNode;
		}
		
		length++;
		
	}
	
	
	/*
	 * Remove First - edge case 1 item and 0 items
	 */
	
	public Node removeFirst() {
		
		Node temp = head;
		if(length==0) 
			return null;
		
		else if(length ==1) {
			head=null;
			tail=null;
			
		}
		else {
			
			head = head.next;
			head.prev=null;
			temp.next=null;	
		}
		
		length--;
		return temp;
			
		}
		
		
		/*
		 * detailed view
		 */
	
	
	 public void printAll() {
	        if (length == 0) {
	            System.out.println("Head: null");
	            System.out.println("Tail: null");
	        } else {
	            System.out.println("Head: " + head.value);
	            System.out.println("Tail: " + tail.value);
	        }
	        System.out.println("Length:" + length);
	        System.out.println("\nDoubly Linked List:");
	        if (length == 0) {
	            System.out.println("empty");
	        } else {
	            printList();
	        }
	    }
	
	
	
	// Getters Setters
	
	public void printList() {
		Node temp= head;
		while(temp!=null) {
			System.out.print(temp.value);
			temp = temp.next;
		}
		System.out.println();
		
	}
	
	public void getHead() {
		System.out.println("Head: "+head.value);
	}
	
	public void getTail() {
		System.out.println("Tail: "+tail.value);
	}
	
	public int getLength() {
		System.out.println("Lenght: "+length);
		return length;
	}
	
	
	public Node getNode(int index) {

		if (index < 0 || index >= length) {
			return null;
		}
		Node temp = head;
		if (index < length / 2) {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			temp = tail;
			for (int i = length - 1; i > index; i--) {
				temp = temp.prev;
			}
		}

		return temp;
	}
	
	public boolean setValue(int index, int value) {
		 	Node temp = getNode(index);
			if(temp !=null) {
				temp.value=value;
				return true;
		}
		return false;
	}
	
	/*
	 * insert 
	 */
	
	public boolean insert(int index, int value) {
		if (index < 0 || index >= length)
			return false;
		if (index == 0) {
			addFirst(value);
			return true;
		}
		if (index == length - 1) {
			append(value);
			return true;
		}

		Node newNode = new Node(value);
		Node before = getNode(index - 1);
		Node after = before.next;

		newNode.prev = before;
		newNode.next = after;
		before.next = newNode;
		after.prev = newNode;
		length++;
		return true;

	}
	
	public Node remove(int index, int value) {
		if (index < 0 || index >= length)
			return null;
		if (index ==0)
			return removeFirst();
		if(index == length-1)
			return removeLast();
		Node temp= getNode(index);
		Node before = temp.prev;
		Node after = temp.next;
		before.next=after;
		after.prev=before;
		temp.prev = null;temp.next=null;
		length--;
		return temp;
		
	}

	/*
	 * remove with one variable
	 */
	public Node remove2(int index) {
		if (index < 0 || index >= length)
			return null;
		if (index == 0)
			return removeFirst();
		if (index == length - 1)
			return removeLast();

		Node temp = getNode(index);
		temp.next.prev = temp.prev;
		temp.prev.next = temp.next;
		temp.prev = null;
		temp.prev = null;
		length--;
		return temp;

	}
	
	
	/*
	 * Coding Exercises
	 */
	
	public void swapFirstLast() {
        if (length < 2) return;
        
        int temp = head.value;
        head.value = tail.value;
        tail.value = temp;
    }
	
	/*
	 * need to revisit this 
	 */
	
	public void swapFirstLast2() {
		if (length < 2)
			return;

		Node firstNode = head;
		Node lastNode = tail;

		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}
		// Swap the next and previous pointers of the first and last nodes

		Node temp = firstNode.next;
		firstNode.next = lastNode.next;
		lastNode.next = temp;

		temp = firstNode.prev;
		firstNode.prev = lastNode.prev;
		lastNode.prev = temp;

		// Update the head if necessary
		if (firstNode == head) {
			head = lastNode;
		}
	}
	
	
	public void reverse() {
		
		if(length<2) return;
		
		 Node current = head;
		 Node temp = null;
		 
		 while (current != null) {
			 temp = current.prev;
			 current.prev = current.next;
			 current.next= temp;
			 current = current.prev; 
		 }
		 
		 temp=head;
		 head = tail;
		 tail = temp;
		
	}
	
	public boolean isPalindrome() {
		if (length <= 1)
			return true;

		for (int i = 0; i < length / 2; i++) {
			if (head.value == tail.value) {
				head = head.next;
				tail = tail.prev;
			} else {
				return false;
			}

		}

		return true;

	}
	
	
	/*
	 * Swap Nodes in Pairs
	 */
	
	public void swapPairs() {

		Node dummyNode = new Node(0);
		dummyNode.next = head;
		Node previousNode = dummyNode;

		while (head != null && head.next != null) {
			Node firstNode = head;
			Node secondNode = head.next;

			previousNode.next = secondNode;
			firstNode.next = secondNode.next;
			secondNode.next = firstNode;
			secondNode.prev = previousNode;
			firstNode.prev = secondNode;
			
			

			if (firstNode.next != null) {
				firstNode.next.prev = firstNode;
			}

			head = firstNode.next;
			previousNode = firstNode;
		}

		head = dummyNode.next;
		if (head != null)
			head.prev = null;
	}
	
	

}
