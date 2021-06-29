class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        
		
		
		
		double[] res = new double[nums.length - k + 1];

		PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());

		for (int index = 0; index < k; index++) {
			min.offer(nums[index]);
			max.offer(min.poll());
			if (min.size() < max.size())
				min.offer(max.poll());
		}

		int resIndex = 0;
		for (int index = k; index < nums.length; index++) {
			if (min.size() == max.size()) {
			res[resIndex++] = ((double) min.peek() + max.peek()) / 2 ;
		} else {
			res[resIndex++] = (double)min.peek();
		}

			int ele = nums[index - k];

			if (!min.remove(ele))
				max.remove(ele);

			if (min.size() < max.size())
				min.offer(max.poll());

			min.offer(nums[index]);
			max.offer(min.poll());
			if (min.size() < max.size())
				min.offer(max.poll());
		}
		if (min.size() == max.size()) {
			res[resIndex++] = ((double) min.peek() + max.peek()) / 2 ;
		} else {
			res[resIndex++] = (double)min.peek();
		}
		return res;
	
	
	
	
    }
}