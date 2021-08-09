class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        
        int index = 0;
        for(int[] cur : intervals)  {
            start[index] = cur[0];
            end[index] = cur[1];
            index++;
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int max = Integer.MIN_VALUE;
        
        int startlow = 0;
        int endLow = 0;
        
        int cur = 0;
        while(startlow < start.length && endLow < start.length)  {
            if(start[startlow] < end[endLow])   {
                cur += 1;
                startlow++;
            } else  {
                cur -= 1;
                endLow++;
            }
            
            max = Math.max(max, cur);
        }
        
        return max;
    }
}