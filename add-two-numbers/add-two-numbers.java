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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1,l2,0);
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if(l1 == null && l2 == null)    {
            if(carry == 1)
                return new ListNode(1);
            else
                return null;
        }
            
        int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
        
        ListNode n = new ListNode(sum%10);
        int req = sum/10;
        
        
        
        n.next = addTwoNumbers(l1 != null ? l1.next : null,l2 != null ? l2.next : null, req);
        
        return n;
    }
}