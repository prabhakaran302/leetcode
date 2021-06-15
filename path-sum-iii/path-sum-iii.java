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
   public int pathSum(TreeNode root, int targetSum) {
		Map<Integer,Integer> set = new HashMap<>();
		Val v = new Val();
		pathSumUtil(root, targetSum, set, v, 0);

		return v.val;
	}

	private void pathSumUtil(TreeNode root, int targetSum, Map<Integer,Integer> set, Val v, int curSum) {
		if (root == null)
			return;

		int sum = root.val + curSum;
        if(sum == targetSum)
            v.val = v.val + 1;
        
		
		v.val = v.val + set.getOrDefault(sum-targetSum,0);

		set.put(sum, set.getOrDefault(sum,0)+1);
        
		pathSumUtil(root.left, targetSum, set, v, sum);
		pathSumUtil(root.right, targetSum, set, v, sum);
        
        set.put(sum, set.get(sum)-1);
	}

	class Val {
		int val;
	}
}