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
    public ListNode removeElements(ListNode head, int val) {
        
		
		ListNode prev = null;

		while (head != null && head.val == val)
			head = head.next;

		ListNode f = head;

		while (head != null) {
			if (head.val == val && prev != null) {

				prev.next = head.next;
				head = head.next;
				continue;
			}
			prev = head;
			head = head != null ? head.next : null;
		}

		return f;
	
	
    }
}