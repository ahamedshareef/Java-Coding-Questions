package DoubleLL;

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
	
	public void getLength() {
		System.out.println("Lenght: "+length);
	}
	
	
	
	

}
