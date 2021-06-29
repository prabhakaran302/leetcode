class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        
		
		int points = 0;
		int sum = 0;
		for (int index = 0; index < k; index++) {
			sum += calories[index];
		}

		for (int index = k; index < calories.length; index++) {
			if (sum < lower)
				points--;
			else if (sum > upper)
				points++;
			sum = sum + calories[index] - calories[index - k];
		}

		if (sum < lower)
			points--;
		else if (sum > upper)
			points++;
		
		return points;
	
	
    }
}