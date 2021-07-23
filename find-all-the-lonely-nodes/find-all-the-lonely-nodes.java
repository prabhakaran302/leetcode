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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        getLonelyNodes(root, l);
        
        return l;
    }
    
    public void getLonelyNodes(TreeNode root, List<Integer> l) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty())  {
            TreeNode cur = q.poll();
            if(cur.left == null ^ cur.right == null)
                l.add(cur.left == null ? cur.right.val : cur.left.val);
            if(cur.left != null)
                q.offer(cur.left);
            if(cur.right != null)
                q.offer(cur.right);
        }
    }
}