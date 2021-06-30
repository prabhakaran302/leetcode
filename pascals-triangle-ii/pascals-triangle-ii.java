class Solution {
    public List<Integer> getRow(int rowIndex) {
		
		List<List<Integer>> dp = new ArrayList<>();
		List<Integer> curList = new ArrayList<>();
		curList.add(1);
		dp.add(curList);

		curList = new ArrayList<>();
		curList.add(1);
		curList.add(1);
		dp.add(curList);

		for (int cur = 2; cur <= rowIndex; cur++) {
			curList = new ArrayList<>();
			for (int listIndex = 0; listIndex <= cur; listIndex++) {
				if (listIndex == 0 || listIndex == cur)
					curList.add(1);
				else
					curList.add(dp.get(cur - 1).get(listIndex) + dp.get(cur - 1).get(listIndex - 1));
			}
			dp.add(curList);
		}

		return dp.get(rowIndex);
	
	}
}