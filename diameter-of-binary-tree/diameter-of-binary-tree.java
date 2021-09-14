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
    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTreeUtil(root);
        return max;
    }
    
    public int diameterOfBinaryTreeUtil(TreeNode root) {
        if(root == null)
            return 0;
        int l = diameterOfBinaryTreeUtil(root.left);
        int r = diameterOfBinaryTreeUtil(root.right);
        
        max = Math.max(max, l + r);
        
        return Math.max(l,r)+1;
    }
}