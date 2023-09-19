package queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue myQueue = new Queue(7);
		
		
		
		myQueue.enqueue(9);
		myQueue.getFirst();
		myQueue.getLast();
		
		myQueue.printQueue();
		System.out.println(myQueue.dequeue().value);
		myQueue.enqueue(3);
		myQueue.enqueue(2);
		myQueue.printQueue();
		
		
		

	}

}
