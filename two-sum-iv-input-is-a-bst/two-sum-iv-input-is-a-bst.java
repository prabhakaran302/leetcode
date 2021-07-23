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
    static boolean res = false;
    public boolean findTarget(TreeNode root, int k) {
        res = false;
        Map<Integer,Integer> map = new HashMap<>();
        findTarget(map,root, k);
        return res;
    }

    public void findTarget(Map<Integer,Integer> map, TreeNode root, int k) {
        if(root == null)
            return;
        if(map.containsKey(root.val))
            res = true;
        
        map.put(k - root.val, root.val);
        
        findTarget(map, root.left, k);
        findTarget(map, root.right, k);
        
    }

}