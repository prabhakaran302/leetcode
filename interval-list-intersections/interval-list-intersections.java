class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
		if (firstList.length * secondList.length == 0)
			return new int[][]{};

		int fl = 0;
		int sl = 0;
		List<List<Integer>> list = new ArrayList<>();

		while (fl < firstList.length && sl < secondList.length) {
			int sele = Math.max(firstList[fl][0], secondList[sl][0]);
			int eele = Math.min(firstList[fl][1], secondList[sl][1]);

            if(sele <= eele) {
                List<Integer> li = new ArrayList<Integer>();
                li.add(sele);
			    li.add(eele);
			    list.add(li);
            }
			

			if (firstList[fl][1] < secondList[sl][1]) {
				fl++;
			} else  {
				sl++;
            }
		}

        
		int[][] res = new int[list.size()][2];
		int index = 0;

		for (List<Integer> li : list) {
			res[index][0] = li.get(0);
			res[index][1] = li.get(1);
			index++;
		}
		return res;
	
    }
}