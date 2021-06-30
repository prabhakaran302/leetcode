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
    public boolean isPalindrome(ListNode head) {
        ListNode origHead = head;
        
        ListNode mid = findMid(head);
        ListNode nH = mid.next;
        
        mid.next = null;
        
        ListNode revHead = reverse(nH);
        
        while(origHead != null && revHead != null) {
            if(origHead.val != revHead.val)
                return false;
            origHead = origHead.next;
            revHead = revHead.next;
        }
        
        return true;
    }
    
    public ListNode findMid(ListNode cur) {
        ListNode f = cur;
        ListNode s = cur;
        while(f != null && f.next != null && f.next.next != null)  {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
    
    public ListNode reverse(ListNode cur) {
        ListNode prev = null;
        ListNode next = null;
        while(cur != null)  {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}