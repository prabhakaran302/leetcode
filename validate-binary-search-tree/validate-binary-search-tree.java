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
    public boolean isValidBST(TreeNode root) {
        return isValidBSTUtil(root, null, null);
    }
    
    public boolean isValidBSTUtil(TreeNode root, Integer min, Integer max) {
        if(root == null)
            return true;
        
        if((min != null && root.val <= min) || (max != null && root.val >= max))
            return false;
        
        boolean l = isValidBSTUtil(root.left, min, root.val);
        boolean r = isValidBSTUtil(root.right, root.val, max);
        
        return l && r;
    }
}