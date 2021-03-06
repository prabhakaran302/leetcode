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
    public int rangeSumBST(TreeNode root, int low, int high) {
		Sum sum = new Sum();
		return rangeSumBST(root, low, high, sum);
	}

	private int rangeSumBST(TreeNode root, int low, int high, Sum sum) {
		if (root == null)
			return 0;

		rangeSumBST(root.left, low, high, sum);
		rangeSumBST(root.right, low, high, sum);

		if (root.val >= low && root.val <= high)
			sum.sum += root.val;

		return sum.sum;
	}

	class Sum {
		int sum = 0;
	}
}