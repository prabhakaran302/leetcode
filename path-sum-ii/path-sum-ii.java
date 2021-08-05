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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        
        pathSum(root, targetSum, list, li, 0);
        
        return list;
    }
    
    public void pathSum(TreeNode root, int targetSum, List<List<Integer>> list, List<Integer> li, int sum)   {
        if(root == null)
            return;
        
        if(root.left == null && root.right == null && sum + root.val == targetSum)    {
            li.add(root.val);
            list.add(new ArrayList<>(li));
            li.remove(li.size()-1);
            return;
        }
        
        li.add(root.val);
        
        pathSum(root.left, targetSum, list, li, sum + root.val);
        pathSum(root.right, targetSum, list, li, sum + root.val);
        
        li.remove(li.size()-1);
        
    }
}