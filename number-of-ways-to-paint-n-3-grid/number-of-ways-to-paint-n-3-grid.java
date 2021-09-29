class Solution {
    public int numOfWays(int n) {
        
		
		
		long a121 = 6;
		long a123 = 6;

		long mod = (long) Math.pow(10, 9) + 7;
		for (int i = 1; i < n; i++) {
			long b121 = a121 * 3 + a123 * 2;
			long b123 = a121 * 2 + a123 * 2;
			a121 = (b121 % mod);
			a123 = (b123 % mod);
		}

		return (int) ((a121 + a123) % mod);
	
	
	
    }
}