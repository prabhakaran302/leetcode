class Solution {
    public int[][] merge(int[][] intervals) {
    
	    
		int[][] res = new int[intervals.length][intervals[0].length];
		int length = 0;

		Comparator<int[]> cmp = new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return ((Integer) o1[0]).compareTo((Integer) o2[0]);
			}
		};

		Arrays.parallelSort(intervals, cmp);
		res[length][0] = intervals[0][0];
		res[length][1] = intervals[0][1];

		for (int i = 1; i < intervals.length; i++) {
			if (res[length][1] >= intervals[i][0]) {
				res[length][1] = Math.max(intervals[i][1], res[length][1]);
			} else {
				res[length + 1][0] = intervals[i][0];
				res[length + 1][1] = intervals[i][1];
				length++;
			}
		}

		return Arrays.copyOf(res, length + 1);
	
    }
}