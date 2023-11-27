package linkedlist;


 // Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

public class DeleteDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode deleteDuplicates(ListNode head) {
	        ListNode temp = head;
	        
		 while(temp!=null) {
			 
			 if(temp.next==null) {
				 break;
			 }
			 
			 if(temp.val == temp.next.val) {
				 temp.next = temp.next.next;
			 }else {
				 temp = temp.next;
			 }
		 }
		 
		 return head;
	    }

}
