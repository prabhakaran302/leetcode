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
    ListNode nh;
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        nh = null;
        reverseListUtil(head);
        head.next = null;
        return nh;
    }
    
    public ListNode reverseListUtil(ListNode head) {
        if(head == null)
            return null;
        ListNode n = reverseListUtil(head.next);
        if(n == null && nh == null) {
            nh = head;
            return nh;
        }
        
        n.next = head;
        
        return head;
    }
}