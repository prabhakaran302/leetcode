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
    public int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;
        return sumNumbersUtil(root, 0);
    }
    
    public int sumNumbersUtil(TreeNode root, Integer val) {
        if(root == null)
            return 0;
        int num = val * 10 + root.val;
        int l = sumNumbersUtil(root.left, num);
        int r = sumNumbersUtil(root.right, num);
        
        if(l == 0 && r == 0)    {
            return num;
        }
        
        return l + r;
    }
}