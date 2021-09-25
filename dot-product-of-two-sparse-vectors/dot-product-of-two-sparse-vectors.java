class SparseVector {
    Map<Integer,Integer> map;
    SparseVector(int[] nums) {
        map = new HashMap<>();
        int i = 0;
        for(int num : nums) {
            if(num != 0)
                map.put(i, num);
            i++;
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int sum = 0;
        for(Map.Entry<Integer,Integer> en :  map.entrySet())    {
            if(vec.map.containsKey(en.getKey()))
                sum += (vec.map.get(en.getKey()) * en.getValue());
        }
        return sum;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);