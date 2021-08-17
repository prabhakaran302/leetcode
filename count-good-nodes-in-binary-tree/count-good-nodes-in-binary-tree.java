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
    public int goodNodes(TreeNode root) {
        Count c = new Count();
        c.count = 0;
        
        goodNodes(root, c, Integer.MIN_VALUE);
        
        return c.count;
    }
    
    public void goodNodes(TreeNode root, Count c, int val) {
        if(root == null)
            return;
        
        if(root.val >= val) {
            c.count++;
        }
        
        int nv = val;
        if(root.val > val)
            nv = root.val;
        
        goodNodes(root.left, c, nv);
        goodNodes(root.right, c, nv);
        
        
    }
    
    class Count {
        int count;
    }
}