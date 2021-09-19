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
    public List<Double> averageOfLevels(TreeNode root) {
        
		List<Double> li = new ArrayList<>();

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {
			int n = q.size();

			double sum = 0;
			for (int i = 0; i < n; i++) {
				TreeNode cur = q.poll();
				sum += cur.val;

				if (cur.left != null) {
					q.offer(cur.left);
				}

				if (cur.right != null) {
					q.offer(cur.right);
				}
			}

			li.add(sum * 1.0 / n * 1.0);
		}

		return li;
	
    }
}