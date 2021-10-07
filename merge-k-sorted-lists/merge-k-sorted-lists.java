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
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b)->(a.val - b.val));
        
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        
        for(int i = 0; i < lists.length;i++)    {
            if(lists[i] != null)
                q.offer(lists[i]);
        }
        
        while(!q.isEmpty()) {
            ListNode cur = q.poll();
            
            res.next = cur;
            res = res.next;

            if(cur != null && cur.next != null)
                q.offer(cur.next);
        }
        
        
        return dummy.next;
    }
}