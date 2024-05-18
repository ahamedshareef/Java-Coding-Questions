package top150linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyRandom138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public static ListNode copyRandomList(ListNode head) {
    if(head == null) return null;    
	Map<ListNode,ListNode> mp = new HashMap<ListNode,ListNode>();
        
        
        //1. loop to create duplicate nodes
		ListNode node = head;
        while(node !=null) {
        	mp.put(node,new ListNode(node.val));
        	node = node.next;
        }
        
        // 2. assign the next and random pointers for copied nodes
        node = head;
        while(node !=null) {
        	mp.get(node).next = mp.get(node.next);
        	mp.get(node).random = mp.get(node.random);
        	node = node.next;
        }
        
        return mp.get(head);
    }

}
