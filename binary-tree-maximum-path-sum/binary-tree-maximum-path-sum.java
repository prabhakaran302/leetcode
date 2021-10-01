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
    int sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathSumUtil(root);
        return sum;
    }
    
    public int maxPathSumUtil(TreeNode root) {
        if(root == null)
            return 0;
        
        int l = Math.max(maxPathSumUtil(root.left),0);
        int r = Math.max(maxPathSumUtil(root.right),0);
        
        sum = Math.max(sum, root.val + l + r);
        
        return Math.max(root.val , Math.max(l,r) + root.val);
    }
}