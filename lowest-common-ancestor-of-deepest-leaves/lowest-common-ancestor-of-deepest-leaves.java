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
    TreeNode lca = null;
    int deepest = 0;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        lcaDeepestLeavesUtil(root, 0);
        return lca;
    }
    
    public int lcaDeepestLeavesUtil(TreeNode root, int depth) {
        deepest = Math.max(deepest, depth);
        if(root == null)
            return depth;
        
        
        int l = lcaDeepestLeavesUtil(root.left, depth + 1);
        int r = lcaDeepestLeavesUtil(root.right, depth + 1);
        
        if(l == deepest && r == deepest)
            lca = root;
        
        return Math.max(l,r);
    }
}