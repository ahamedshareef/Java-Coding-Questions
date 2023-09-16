package DoubleLL;

public class DLLMain {

	public static void main(String[] args) {
		
		DoubleLinkedList myDLL = new DoubleLinkedList(7);
		myDLL.append(4);
		myDLL.printList();
		myDLL.addFirst(1);
		myDLL.printList();
		myDLL.getHead();
		myDLL.getTail();
		System.out.println(myDLL.removeFirst().value);
		myDLL.getHead();
		
		
		
//		myDLL.getHead();
//		myDLL.getTail();
//		myDLL.getLength();
//		myDLL.printList();
		
		//myDLL.removeLast();
		
//System.out.println(myDLL.removeLast().value);
//System.out.println(myDLL.removeLast().value);
//System.out.println(myDLL.removeLast().value);
//System.out.println(myDLL.removeLast().value);
		
		

	}

}
