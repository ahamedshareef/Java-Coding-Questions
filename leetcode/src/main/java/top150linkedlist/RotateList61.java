package top150linkedlist;

public class RotateList61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(4,new ListNode(5)))));
		rotateRight(head,7);
	}
	
	 public static ListNode rotateRight(ListNode head, int k) {
		 
		 if (head==null||head.next==null) return head;
		 
		 ListNode dummy = new ListNode(0);
		 dummy.next = head;
		 ListNode fast=dummy;
		 ListNode slow=dummy;
		 
		 
		 int i; // get the total lenght.
		 for(i=0;fast.next!=null;i++) {fast = fast.next;}
		 
		 // now i has the total lenght.  % has more precedence to -
		 //System.out.println(i-k%i);
		 for(int j=i-k % i;j>0;j--) {slow = slow.next;}
		 
		 fast.next = dummy.next;
		 dummy.next= slow.next;
		 slow.next=null;

		 return dummy.next;
	        
	    }
	 

}
