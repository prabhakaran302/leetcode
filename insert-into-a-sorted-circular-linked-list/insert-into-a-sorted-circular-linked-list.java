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
            Node n = new Node(insertVal);
            n.next = n;
            return n;
        }
        
        Node cur = head;
        Node next = head.next;
        
        boolean toInsert = false;
        
        while(next != head) {
            if(cur.val <= insertVal && insertVal <= next.val) {
                toInsert = true;
            } else if(cur.val> next.val)  {
                if(insertVal >= cur.val || insertVal <= next.val)
                    toInsert = true;
            }
            
            if(toInsert)    {
                Node n = new Node(insertVal, next);
                cur.next = n;
                return head;
            }
            cur = next;
            next = next.next;
        }
        
        Node n = new Node(insertVal, next);
        cur.next = n;
        return head;
        
        
    }
}