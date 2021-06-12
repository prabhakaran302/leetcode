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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
		List<List<Integer>> li = new ArrayList<>();
        if(root == null)
            return li;
		Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
		while (!q.isEmpty()) {
			int n = q.size();
			List<Integer> l = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				TreeNode cur = q.poll();
				l.add(cur.val);
				
				if (cur.left != null)
					q.add(cur.left);

				if (cur.right != null)
					q.add(cur.right);
			}
			li.add(l);

		}
		Collections.reverse(li);
		return li;
	
    }
}