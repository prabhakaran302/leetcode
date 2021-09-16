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
        int carry = 0;
        return addTwoNumbers(l1,l2,carry);
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if(l1 == null && l2 == null)    {
            if(carry == 1)  {
                ListNode n = new ListNode(carry);
                return n;
            } else
                return null;
        }
        
        int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
        if(sum > 9)
            carry = 1;
        else
            carry = 0;
        
        ListNode head = new ListNode(sum % 10);
        head.next = addTwoNumbers(l1 != null ? l1.next : null, l2 != null ? l2.next : null, carry);
        
        return head;
        
    }
}