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
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);

            while(!q.isEmpty())  {
                int n = q.size();
                
                boolean f = false;
                boolean s = false;
                
                for(int i = 0; i < n; i++)  {
                    TreeNode cur = q.poll();
                    System.out.println(cur.val);
                    boolean ab = false;
                    
                    if((cur.left != null && cur.left.val == x) || (cur.right != null && cur.right.val == x))    {
                        f = true;
                        ab = true;
                    }
                    
                    if(!ab && ((cur.left != null && cur.left.val == y) || (cur.right != null && cur.right.val == y)))
                        s = true;
                    
                    if(cur.left != null)
                        q.offer(cur.left);
                    if(cur.right != null)
                        q.offer(cur.right);
                    
                }
                
                if(f && s)
                    return true;
                
                f = false;
                s = false;
                
            }
        
        return false;
    }
}