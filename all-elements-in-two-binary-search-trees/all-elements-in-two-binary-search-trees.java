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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayDeque<TreeNode> st1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> st2 = new ArrayDeque<>();
        List<Integer> output = new ArrayList();
        
        while (root1 != null || root2 != null || !st1.isEmpty() || !st2.isEmpty()) {
            while(root1 != null)    {
                st1.push(root1);
                root1 = root1.left;
            }
        
            while(root2 != null)    {
                st2.push(root2);
                root2 = root2.left;
            }
        
            if (st2.isEmpty() || !st1.isEmpty() && st1.getFirst().val <= st2.getFirst().val) {
                root1 = st1.pop();
                output.add(root1.val);
                root1 = root1.right;
            } else {
                root2 = st2.pop();
                output.add(root2.val);
                root2 = root2.right;
            }
        }
        
        return output;
    }
}