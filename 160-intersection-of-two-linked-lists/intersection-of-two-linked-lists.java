/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Get the lengths of both lists
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);
        
        // Align both lists to the same starting point
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }
        
        // Move both pointers until they meet or reach the end
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        // Return either the intersection node or null
        return headA;
    }
    
    private int getListLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
