/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        
        if(head == null)    {
            Node newN = new Node(insertVal);
            newN.next = newN;
            return newN;
        }
        
		Node aHead = head;
		Node prev = head;
		Node cur = head.next;

		boolean toIns = false;

		while (cur != aHead) {
			if (prev.val <= insertVal && insertVal <= cur.val) {
				toIns = true;
			}

			if (prev.val > cur.val) {
				if (prev.val < insertVal || insertVal < cur.val)
					toIns = true;
			}

			if (toIns) {
				Node newN = new Node(insertVal, cur);
				prev.next = newN;
				return aHead;
			}

			prev = cur;
			cur = cur.next;
		}
		
		Node newN = new Node(insertVal, cur);
		prev.next = newN;

		return aHead;
	
    }
}