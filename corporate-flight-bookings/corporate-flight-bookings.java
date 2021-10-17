class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int [] res = new int[n];
        
        for(int i = 0; i < bookings.length; i++)    {
            int val = bookings[i][2];
            for(int j = bookings[i][0]; j <= bookings[i][1]; j++)    {
                res[j-1] += val;
            }
        }
        
        return res;
    }
}