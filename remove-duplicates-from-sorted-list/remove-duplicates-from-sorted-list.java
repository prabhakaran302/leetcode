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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode prev = head;
        ListNode cur = head.next;
        while(cur != null)  {
            if(prev.val == cur.val) {
                while(cur != null && cur.val == prev.val)
                    cur = cur.next;
                
                prev.next = cur;
            }
            
            ListNode next = cur != null ? cur.next : cur;
            prev = cur;
            cur = next;
        }
        return head;
    }
}