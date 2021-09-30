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
        if(head == null)
            return head;
        ListNode odd = head;
        ListNode even = head != null ? head.next : null;
        ListNode evenNext = head != null ? head.next : null;
        
        ListNode curOdd = odd;
        ListNode curEven = even;
        
        while(curEven != null && curEven.next != null)    {
            ListNode oddn = curOdd.next.next;
            ListNode evenn = curEven.next.next;
            
            curOdd.next = oddn;
            curEven.next = evenn;
            
            curOdd = oddn;
            curEven = evenn;
        }
        
        curOdd.next = evenNext;
        
        return odd;
    }
}