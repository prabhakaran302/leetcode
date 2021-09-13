class Solution {
    Map<Integer, List<Integer>> map;
	Random r;
    public Solution(int[] nums) {
        
		map = new HashMap<>();
		r = new Random();
		int index = 0;
		for (int num : nums) {
			map.computeIfAbsent(num, x -> new ArrayList<>()).add(index);
			index++;
		}
	
    }
    
    public int pick(int target) {
        
		return map.get(target).get(r.nextInt(map.get(target).size()));
	
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */