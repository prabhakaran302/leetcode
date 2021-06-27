class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
		int[] result = new int[n];

		for (int curIndex = 0; curIndex < bookings.length; curIndex++) {
			for (int flight = bookings[curIndex][0]; flight <= bookings[curIndex][1]; flight++) {
				result[flight - 1] += bookings[curIndex][2];
			}
		}

		return result;
	
    }
}