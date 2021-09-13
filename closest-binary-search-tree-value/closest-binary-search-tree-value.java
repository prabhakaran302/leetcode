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
    public int closestValue(TreeNode root, double target) {
        
		double closest = root.val;
		while (root != null) {
			int curVal = root.val;
			closest = Math.abs(target - curVal) > Math.abs(closest-target) ?  closest: curVal;
			root = curVal > target ? root.left : root.right;
		}
		return (int)closest;
	
    }
}