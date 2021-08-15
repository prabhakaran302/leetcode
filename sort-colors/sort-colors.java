class Solution {
    public void sortColors(int[] nums) {
        int beg = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while(mid <= high)   {
            switch(nums[mid]) {
                case 0:
                    int temp = nums[beg];
                    nums[beg] = nums[mid];
                    nums[mid] = temp;
                    beg++;
                    mid++;
                    break;
                case 1:
                    
                    mid++;
                    break;
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
            }
        }
    }
}