/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null; // Edge case: empty list
        if (head.next == null) return head; // Edge case: single node list
        
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextNode = current.next; // Store the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = nextNode; // Move current to next node
        }
        
        return prev; // Prev is the new head of the reversed list
    }
}
