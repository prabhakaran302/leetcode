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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null)
            return null;
        
        int sum = (root1 != null ? root1.val : 0) + (root2 != null ? root2.val : 0);
        TreeNode n1 = new TreeNode(sum);
        
        n1.left = mergeTrees(root1 != null ? root1.left : null, root2 != null ? root2.left : null);
        n1.right = mergeTrees(root1 != null ? root1.right : null, root2 != null ? root2.right : null);
        
        return n1;
    }
}