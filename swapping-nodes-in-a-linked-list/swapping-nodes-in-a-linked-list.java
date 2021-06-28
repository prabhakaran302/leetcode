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
    public ListNode swapNodes(ListNode head, int k) {
        
		ListNode ret = head;
		ListNode cur = head;
		ListNode prev = null;

		while (k >= 1 && cur != null) {
			prev = cur;
			cur = cur.next;
			k -= 1;
		}

		ListNode fHead = head;
		while (cur != null) {
			cur = cur.next;
			fHead = fHead.next;
		}
		
		int temp = prev.val;
		prev.val = fHead.val;
		fHead.val = temp;

		return ret;
	
    }
}