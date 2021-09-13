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
        
		if (head == null) {
			Node n = new Node(insertVal);
			n.next = n;
			return n;
		}

		Node aHead = head;

		Node cur = head.next;
		Node prev = head;

		boolean insert = false;

		while (cur != aHead) {
			if (prev.val <= insertVal && cur.val >= insertVal)
				insert = true;

			if (prev.val > cur.val)
				if (prev.val <= insertVal || cur.val >= insertVal)
					insert = true;

			if (insert) {
				Node n = new Node(insertVal);
				prev.next = n;
				n.next = cur;
				return aHead;
			}
			prev = cur;
			cur = cur.next;
		}

		Node n = new Node(insertVal);
		prev.next = n;
		n.next = cur;
		
		return aHead;
	
    }
}