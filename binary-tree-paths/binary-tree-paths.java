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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        binaryTreePaths(root, list, "");
        return list;
    }
    
    public void binaryTreePaths(TreeNode root, List<String> list, String strVal) {
        if(root == null)
            return;
        String cur = root.val+"->";
        if(root.left == null && root.right == null)  {
            cur = cur.substring(0,cur.indexOf("->"));
            strVal = strVal + cur;
            list.add(strVal);
        }
        strVal = strVal + cur;
        binaryTreePaths(root.left, list, strVal);
        
        binaryTreePaths(root.right, list, strVal);
    }
}