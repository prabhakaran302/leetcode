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
    public void flatten(TreeNode root) {
		if(root == null)
			return;
		flattenUtil(root);
	}

	private TreeNode flattenUtil(TreeNode root) {
		if(root == null)
			return root;
        
        
        
		TreeNode l = flattenUtil(root.left);
		TreeNode r = flattenUtil(root.right);
		
        if(root.left == null && root.right == null)
            return root;
        
		
		if(l != null)   {
            l.right = root.right;
            root.right = root.left;
            root.left = null;
        }
		
		return r != null ? r : l;
	}
}