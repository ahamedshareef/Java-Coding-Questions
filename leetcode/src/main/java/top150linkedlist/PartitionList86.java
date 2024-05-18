package top150linkedlist;

public class PartitionList86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode partition(ListNode head, int x) {
		 
		 ListNode left = new ListNode(0);
	     ListNode right = new ListNode(0);
	     
	     ListNode leftTail = left;
	     ListNode rightTail = right;
	     
	     while(head != null) {
	    	 if(head.val <x) {
	    		 leftTail.next = head;
	    		 leftTail = leftTail.next;
	    	 }else {
	    		 rightTail.next = head;
	    		 rightTail = rightTail.next;
	    	 }

	    	 head = head.next;
	     }
	     
	     leftTail.next = right.next;
	     rightTail.next = null;
	      
	     return left.next;
	    }

}
