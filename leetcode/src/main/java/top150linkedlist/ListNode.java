package top150linkedlist;

public class ListNode {
    int val;
    ListNode next;
    ListNode random;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    ListNode(int val, ListNode next, ListNode random) { this.val = val; this.next = next; this.random = null; }
}