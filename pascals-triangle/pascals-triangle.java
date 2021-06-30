class Solution {
    public List<List<Integer>> generate(int numRows) {
        
		List<List<Integer>> dp = new ArrayList<>();
		List<Integer> curList = new ArrayList<>();
		curList.add(1);
		dp.add(curList);
        
        if(numRows == 1)
            return dp;

		curList = new ArrayList<>();
		curList.add(1);
		curList.add(1);
		dp.add(curList);
        if(numRows == 2)
            return dp;

		for (int cur = 2; cur < numRows; cur++) {
			curList = new ArrayList<>();
			for (int listIndex = 0; listIndex <= cur; listIndex++) {
				if (listIndex == 0 || listIndex == cur)
					curList.add(1);
				else
					curList.add(dp.get(cur - 1).get(listIndex) + dp.get(cur - 1).get(listIndex - 1));
			}
			dp.add(curList);
		}

		return dp;
	
    }
}