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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        
        int dl = diameterOfBinaryTree(root.left);
        int dr = diameterOfBinaryTree(root.right);
        
        return Math.max(Math.max(dl,dr), lh+rh);
    }
    
    public int getHeight(TreeNode root) {
        if(root == null)
            return 0;
        int l = getHeight(root.left);
        int r = getHeight(root.right);
        
        return Math.max(l,r)+1;
    }
}