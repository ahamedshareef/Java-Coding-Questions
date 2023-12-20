package top150linkedlist;

public class RemoveDuplicate82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(2,new ListNode(4,new ListNode(4)))));
		deleteDuplicates(head);
	}
	
	
public static ListNode deleteDuplicates(ListNode head) {
	
	ListNode dummy =  new ListNode(0);
	dummy.next=head;
	
	ListNode slow = dummy; // slow to track duplicates
	ListNode fast = head;  // fast node is to find the last node of the list
	slow.next = fast;
	
	while(fast!=null) {
		while(fast.next!=null && fast.val== fast.next.val) { fast = fast.next;}// ignore all the duplicates
		
		if(slow.next != fast) {
			slow.next = fast.next;
			fast = slow.next; //reposition fast pointer to go again.
		}else { // we did not find any duplicate
			slow=slow.next;
			fast=fast.next;
		}
	
		
	}
	
	
		
	return dummy.next;
        
    }


}
