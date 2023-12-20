package top150linkedlist;


//Definition for singly-linked list.


public class ReverseLL92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(4,new ListNode(5)))));
			reverseBetween(head,2,4);

	}
	
	
	 public static ListNode reverseBetween(ListNode head, int left, int right) {
		 if(head==null) return null;
		 //creating a node dummy for handeling corner cases where the reversal node can include 1st node.
		 ListNode dummy = new ListNode(0);
		 dummy.next = head;
		 
		 // create 2 new pointers for Pre and move it to previous just before reversing.
		 ListNode pre = dummy;
		 for(int i=0;i<left-1;i++) {pre=pre.next;}
		 
		 // for reversing as usual we need current, after
		 ListNode current = pre.next;
		 ListNode after = current.next;
		 
		 // we should not move pre and start and only move after to current.next. and do the following
		 
		 for(int i=0;i<right-left;i++) {
			 current.next = after.next; // reach current element to next of after
			 after.next = pre.next; // reverse after.next to back side
			 pre.next = after; // prev. next to after
			 after = current.next; // move after to current.next; as before the loop.
		 }
		 
		 return dummy.next;
	        
	    }
	
	// look at this diagram to explain.
	 //https://assets.leetcode.com/static_assets/discuss/uploads/files/1490008792563-reversed_linked_list.jpeg
	 

}
