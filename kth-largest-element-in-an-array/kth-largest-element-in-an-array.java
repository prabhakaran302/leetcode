class Solution {
    public int findKthLargest(int[] nums, int k) {
        
		
		int n = nums.length;
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int num : nums) {
			q.offer(num);
			if (q.size() > k)
				q.poll();
		}
		
		return q.poll();
	
	
    }
}