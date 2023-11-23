package leetcode;


 // Definition for singly-linked list.
 
class ListNode {
      int val;
      ListNode next;
      int length;
      ListNode() {}
      ListNode(int val) { this.val = val; length++;}
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      
 }
 

public class ReverseLinkedList206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode reverseList(ListNode head) {
        ListNode prev = null;  
        ListNode current = head;
    
        
        while(current != null) { 
            ListNode next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
       return prev; 
    }
	}
