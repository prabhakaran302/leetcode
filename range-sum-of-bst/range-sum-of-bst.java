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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        rangeSumBSTUtil(root, low, high);
        return sum;
    }
    
    public void rangeSumBSTUtil(TreeNode root, int L, int R) {
        if(root == null)
            return;
        
        if(root.val >= L && root.val <= R)    {
            rangeSumBSTUtil(root.left, L, R);
            rangeSumBSTUtil(root.right, L, R);
            sum += root.val;
        } else if(root.val < L)
            rangeSumBSTUtil(root.right, L, R);
        else if(root.val > R)
            rangeSumBSTUtil(root.left, L, R);
        
        
        
    }
}