/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
		ListNode curA = headA;
		int lenA = 0;
		while (curA != null) {
			lenA++;
			curA = curA.next;
		}

		ListNode curB = headB;
		int lenB = 0;
		while (curB != null) {
			lenB++;
			curB = curB.next;
		}

		ListNode f = lenA > lenB ? headA : headB;
		ListNode s = lenA > lenB ? headB : headA;

		int diff = Math.abs(lenA - lenB);
		while (diff-- > 0) {
			f = f.next;
		}

		while (true && f != null && s != null) {
			if (f == s)
				return f;
			f = f.next;
			s = s.next;
		}

		return null;
	
    }
}