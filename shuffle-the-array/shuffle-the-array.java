class Solution {
    public int[] shuffle(int[] nums, int n) {
        int low = 0;
        int high = n;
        int[] res = new int[nums.length];
        int index = 0;
        while(high <= nums.length - 1)   {
            res[index++] = nums[low++];
            res[index++] = nums[high++];
        }
        return res;
    }
}