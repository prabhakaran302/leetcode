/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int count = 0;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        count = 0;
        TreeNode n = lcaUtil(root,p,q);
        return count == 2 ? n : null;
    }
    
    public TreeNode lcaUtil(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        
       
        
        TreeNode l = lcaUtil(root.left, p , q);
        TreeNode r = lcaUtil(root.right, p , q);
        
         if(root == p || root == q)  {
            count++;
            return root;
        }
        
        
        return l == null ? r : r == null ? l : root;
    }
}