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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        
        System.out.println(Arrays.toString(nums));
        
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + (high-low)/2);
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, low, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid+1, high+1));
        
        return root;
    }
}