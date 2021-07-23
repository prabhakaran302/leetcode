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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        preOrder(root, l);
        
        int diff = Integer.MAX_VALUE;
        for(int i = 1;i < l.size();i++) {
            diff = Math.min(diff, l.get(i) - l.get(i-1));
        }
        return diff;
    }
    
    public void preOrder(TreeNode root, List<Integer> l)  {
        if(root == null)
            return;
        preOrder(root.left, l);
        l.add(root.val);
        preOrder(root.right, l);
    }
}