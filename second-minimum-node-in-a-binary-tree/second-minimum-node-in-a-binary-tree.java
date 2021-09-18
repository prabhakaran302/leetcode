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
    int min1;
    long ans = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        findSecondMinimumValueUtil(root);
        
        
        return ans < Long.MAX_VALUE ? (int) ans : -1;
        
    }
    
    public void findSecondMinimumValueUtil(TreeNode root) {
        if(root != null)    {
            if (min1 < root.val && root.val < ans) {
                ans = root.val;
            } else if (min1 == root.val) {
                findSecondMinimumValueUtil(root.left);
                findSecondMinimumValueUtil(root.right);
            }
        }
            
        
    }
}