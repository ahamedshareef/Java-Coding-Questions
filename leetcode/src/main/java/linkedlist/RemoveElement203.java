package linkedlist;

public class RemoveElement203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode removeElements(ListNode head, int val) {
		 ListNode temp = head;
		 
		 while(temp.next!=null) {
			 if(temp.next.val==val) {
				 temp.next = temp.next.next;
			 }else {
				 temp=temp.next;
			 }
		 }
		 return head;
	        
	    }

}
