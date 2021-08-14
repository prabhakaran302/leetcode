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
    public ListNode mergeKLists(ListNode[] lists) {
        
		ListNode result = new ListNode(-1);
		ListNode curr = result;

		PriorityQueue<QNode> q = new PriorityQueue<>((a, b) -> a.val - b.val);
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] != null) {
				QNode node = new QNode();
				node.val = lists[i].val;
				node.node = lists[i];

				q.offer(node);
			}
		}

		while (!q.isEmpty()) {
			QNode cur = q.remove();
			curr.next = new ListNode(cur.val);
			curr = curr.next;

			ListNode t = cur.node;
			if (t != null && t.next != null) {
				QNode node = new QNode();
				node.val = t.next.val;
				node.node = t.next;

				q.offer(node);
			}
		}
		return result.next;
	
    }
    
    class QNode {
        int val;
        ListNode node;
    }
}