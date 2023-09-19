package DoubleLL;

public class DLLMain {

	public static void main(String[] args) {
		
		DoubleLinkedList myDLL = new DoubleLinkedList(7);
		myDLL.append(4);
		myDLL.printList();
		myDLL.addFirst(1);
		myDLL.printList();
		
//		System.out.println(myDLL.removeFirst().value);
//		myDLL.getHead();
		
		System.out.println(myDLL.getNode(2).value);
		
		myDLL.setValue(1,6);
		myDLL.printList();
		myDLL.insert(1, 9);
		myDLL.printList();
		//myDLL.remove2(2);
		//myDLL.printList();
		
		myDLL.reverse();
		myDLL.printList();
		myDLL.swapPairs();
		myDLL.printList();
		
		
		
		
		
		
		
		
		
		
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
