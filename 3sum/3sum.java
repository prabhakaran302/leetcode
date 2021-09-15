class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
		Set<List<Integer>> list = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (set.add(nums[i])) {
				for (int j = i + 1; j < nums.length; j++) {
					int sum = -nums[i] - nums[j];
					if (map.containsKey(nums[j]) && map.get(nums[j]) == i) {
						List<Integer> l = new ArrayList<Integer>();
						l.add(nums[i]);
						l.add(nums[j]);
						l.add(sum);
						
						Collections.sort(l);
						
						list.add(l);
					}
					map.put(sum, i);
				}
			}
		}

		return new ArrayList<>(list);
	
    }
}