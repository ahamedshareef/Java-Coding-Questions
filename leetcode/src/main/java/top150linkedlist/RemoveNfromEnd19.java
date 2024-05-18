package top150linkedlist;

public class RemoveNfromEnd19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public ListNode removeNthFromEnd(ListNode head, int n) {
	if (head == null) return null;
	
	/*
	 * ListNode temp = head; int size = 1; while(temp != null) { size++; temp =
	 * temp.next; }
	 * 
	 * int m = size - n; temp = head; for (int i =0;i< m;i++) { temp = temp.next; }
	 * temp.next = temp.next.next;
	 * 
	 * return head;
	 */
	
	ListNode dummy_node = new ListNode(0);
	ListNode slow = dummy_node, fast = dummy_node;
	slow.next = head;
	
	// move fast by n
	for(int i=0;i<=n;i++) {
		fast = fast.next;
	}
	
	// move fast till we hit a null
	while(fast!=null) {
		fast = fast.next;
		slow = slow.next;
	}
	
	// skip the Node
	slow.next = slow.next.next;
	return dummy_node.next;
	
    }

}
