class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
		
		PriorityQueue<int[]> heap = new PriorityQueue<>(
				(p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);

		for (int[] cur : points) {

			heap.offer(cur);
			if (heap.size() > k)
				heap.poll();

		}

		int[][] ans = new int[heap.size()][2];
		int index = 0;
		for (int a[] : heap) {
			ans[index++] = a;
		}
		return ans;
	
	
    }
}