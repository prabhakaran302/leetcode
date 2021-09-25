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
        Node prev = head;
        Node next = head.next;
        
        boolean toInsert = false;
        
        while(next != head)    {
            if(prev.val <= insertVal && next.val >= insertVal)    {
                toInsert = true;
            } else if(prev.val > next.val) {
                if (insertVal >= prev.val || insertVal <= next.val)
                    toInsert = true;
            }
            
            
            if(toInsert)    {
                prev.next = new Node(insertVal, next);
                return head;
            }
            
            prev = next;
            next = next.next;
        }
        
        prev.next = new Node(insertVal, next);
        return head;
    }
}