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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Sum s = new Sum();
        rangeSumBST(root, low, high, s);
        return s.sum;
    }
    
    public void rangeSumBST(TreeNode root, int low, int high, Sum s) {
        if(root == null)
            return;
        if(root.val >= low && root.val <= high)
            s.sum = s.sum + root.val;
        
        rangeSumBST(root.left, low, high, s);
        rangeSumBST(root.right, low, high, s);
    }
    
    class Sum   {
        int sum;
    }
}