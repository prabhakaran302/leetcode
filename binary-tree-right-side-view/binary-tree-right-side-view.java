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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        if(root == null)
            return li;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
       
        
        while(!q.isEmpty()) {
            int n = q.size();
            
            for(int i = 0; i < n;i++)   {
                TreeNode cur = q.poll();
                if(i ==  n - 1)  {
                    li.add(cur.val);
                }
                
                if(cur.left != null)
                    q.offer(cur.left);
                
                if(cur.right != null)
                    q.offer(cur.right);
                
            }
        }
        return li;
    }
}