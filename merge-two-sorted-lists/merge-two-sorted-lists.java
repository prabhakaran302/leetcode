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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null & l2 == null)
            return null;
        
        if(l1 == null ^ l2 == null) {
            return l1 == null ? l2 : l1; 
        }
        
        ListNode n = new ListNode(Math.min(l1.val, l2.val));
        
        if(l1.val < l2.val) {
            n.next = mergeTwoLists(l1.next, l2); 
        } else  {
            n.next = mergeTwoLists(l1, l2.next); 
        }
        
        return n;
        
    }
}