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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
            return list;
		Map<Integer, List<Integer>> map = new TreeMap<>();

		Queue<QueueEle> queue = new LinkedList<>();
		QueueEle ele = new QueueEle(root, 0);
		queue.offer(ele);

		while (!queue.isEmpty()) {
			QueueEle cur = queue.poll();
			map.computeIfAbsent(cur.level, x -> new ArrayList<>()).add(cur.root.val);

			if (cur.root.left != null)
				queue.offer(new QueueEle(cur.root.left, cur.level - 1));

			if (cur.root.right != null)
				queue.offer(new QueueEle(cur.root.right, cur.level + 1));
		}
		for (Map.Entry<Integer, List<Integer>> en : map.entrySet()) {
			list.add(en.getValue());
		}

		return list;
	}

	class QueueEle {
		TreeNode root;
		int level;

		public QueueEle(TreeNode root, int level) {
			super();
			this.root = root;
			this.level = level;
		}

	}
}