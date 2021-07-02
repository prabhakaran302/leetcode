/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null)
            return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty())  {
            int size = q.size();
            
            boolean f = false;
            boolean s = false;
            System.out.println(size);
            for(int i = 0; i < size; i++)    {
                TreeNode cur = q.poll();
                if(cur != null && cur.left != null && cur.right != null)    {
                    if((cur.left.val == x && cur.right.val == y) || (cur.right.val == x && cur.left.val == y))    {
                        return false;
                    }
                }
                    
                
                if(cur.val == x)
                    f = true;
                if(cur.val == y)
                    s = true;
                
                
                if(cur.left != null)
                    q.offer(cur.left);
                if(cur.right != null)
                    q.offer(cur.right);
            }
            if(f && s)
                return true;
            if(f^s)
                return false;
            
        }
        return false;
    }
}