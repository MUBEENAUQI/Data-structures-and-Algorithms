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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        
        while (even != null && even.next != null) {
            odd.next = even.next; // Link next odd node
            odd = odd.next; // Move odd pointer to next odd node
            even.next = odd.next; // Link next even node
            even = even.next; // Move even pointer to next even node
        }
        
        // Connect odd list with even list
        odd.next = evenHead;

        return head;
    }
}
