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
        return addTwoNumbersUtil(l1,l2,0);
    }
    
    public ListNode addTwoNumbersUtil(ListNode l1, ListNode l2, int carry) {
        if(l1 == null && l2 == null && carry == 0)
            return null;
        
        int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
        carry = sum/10;
        
        ListNode r = new ListNode(sum % 10);
        r.next = addTwoNumbersUtil(l1 == null ? null : l1.next, l2 == null ? null : l2.next, carry);
        
        return r;
    }
    
}