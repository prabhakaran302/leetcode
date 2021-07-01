class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result[] = new int[nums.length];
        
        int index = nums.length - 1;
        while(left <= right)   {
            int square = 1;
            if(Math.abs(nums[left]) <= nums[right])  {
                square = nums[right] * nums[right];
                right--;
            } else  {
                square = nums[left] * nums[left];
                left++;
            }
            result[index--] = square;
        }
        
        return result;
    }
}