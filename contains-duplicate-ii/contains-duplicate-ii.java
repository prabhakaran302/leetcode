class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
		
		boolean result = false;
		Set<Integer> set = new LinkedHashSet<>();
		for (int cur = 0; cur < nums.length; cur++) {
			int onum = cur - k;
			if (onum > 0)
				set.remove(set.iterator().next());

			if (!set.add(nums[cur]))
				return true;
		}

		return result;
	
	
    }
}