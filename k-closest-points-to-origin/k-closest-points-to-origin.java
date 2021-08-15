class Solution {
    public int[][] kClosest(int[][] points, int k) {
		KClosest comp = new KClosest();
		PriorityQueue<int[]> q = new PriorityQueue<>(comp);
		int[][] res = new int[k][2];
		for (int[] point : points) {
			q.offer(point);
			if (q.size() > k) {
				q.poll();
			}
		}

		int index = 0;
		while (!q.isEmpty()) {
			int cur[] = q.poll();
			res[index][0] = cur[0];
			res[index][1] = cur[1];
			index++;
		}

		return res;
	}

	class KClosest implements Comparator<int[]> {

		@Override
		public int compare(int[] o1, int[] o2) {
			return (o2[0] * o2[0] + o2[1] * o2[1] - o1[0] * o1[0] - o1[1] * o1[1]);
		}

	}
}