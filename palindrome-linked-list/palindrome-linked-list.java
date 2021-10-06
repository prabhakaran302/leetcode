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
    ListNode front;
    boolean fval;
    public boolean isPalindrome(ListNode head) {
        front = head;
		fval = true;
		isPalindromeUtil(head);
		return fval;
	}

	private void isPalindromeUtil(ListNode head) {
		if (head == null)
			return;
		isPalindromeUtil(head.next);
		if (front.val != head.val) {
			fval = false;
			return;
		}
		front = front.next;
	}
    
    
}