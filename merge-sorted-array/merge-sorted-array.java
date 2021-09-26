class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length - 1;
        
        m = m - 1;
        n = n - 1;
        
        while(m >= 0 || n >= 0) {
            if((m >= 0 && n >= 0 && nums1[m] > nums2[n]) || n == -1)   {
                nums1[k] = nums1[m];
                m--;
            } else if((m >= 0 && n >= 0 && nums1[m] <= nums2[n]) || m == -1)    {
                nums1[k] = nums2[n];
                n--;
            }
            k--;
        }
    }
}