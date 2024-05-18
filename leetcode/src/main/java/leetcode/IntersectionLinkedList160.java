package leetcode;

public class IntersectionLinkedList160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	
	if(headA == null || headB == null) return null;
	
	ListNode a = headA;
	ListNode b = headB;
	
	while (a != b) {
		a= a== null? headB:a.next;
		b= b== null? headA:b.next;
		
	} 
	
	return a;
    }
}
