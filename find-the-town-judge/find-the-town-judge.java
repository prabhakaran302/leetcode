class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n <= 1)
            return 1;
		
		Set<Integer> set = new HashSet<>();
		int[] inD = new int[n];
		int max = 0;
		int jud = -1;
		for (int[] t : trust) {
			set.add(t[0]);
			inD[t[1] - 1]++;
			if (max < inD[t[1] - 1]) {
				max = inD[t[1] - 1];
				jud = t[1];
			}
		}
        
		if (max == n-1 && !set.contains(jud))
			return jud;

		return -1;
	
	
    }
}