class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        
		
		List<String> res = new ArrayList<>();
        if(nums.length == 0)    {
            res.add(getValue(lower, upper));
            return res;
        }

		if (nums[0] > lower) {
			res.add(getValue(lower, nums[0] - 1));
		}

		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] + 1 != Math.min(nums[i], upper)) {
				res.add(getValue(nums[i - 1] + 1, nums[i] - 1));
			}
			if (nums[i] >= upper)
				break;
		}

		if (nums[nums.length - 1] < upper) {
			res.add(getValue(nums[nums.length - 1] + 1, upper));
		}

		return res;
	
	
    }
    
    private String getValue(int lower, int high) {
		return lower == high ? lower + "" : lower + "->" + high;
	}
}