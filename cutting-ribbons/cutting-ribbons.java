class Solution {
    public int maxLength(int[] ribbons, int k) {
        
		
		
		
		
		int lower = 0;
		long upper = 0;
		for (int item : ribbons)
			upper += item;
		upper /= k;

		while (lower < upper) {
			int middle = lower + (int) (upper - lower + 1) / 2;
			int count = 0;

			for (int i = 0; i < ribbons.length; i++) {
				count += ribbons[i] / middle;
				if (count > k)
					break;
			}

			if (count < k)
				upper = middle - 1;
			else
				lower = middle;
		}

		return lower;
	
	
	
	
	
    }
}