class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length <= 1)
            return intervals.length;
        
        List<Integer> start = new ArrayList<>();
        List<Integer> end = new ArrayList<>();
        
        for(int [] interval : intervals)    {
            start.add(interval[0]);
            end.add(interval[1]);
        }
        
        Collections.sort(start);
        Collections.sort(end);
        
        int i = 0;
        int j = 0;
        
        int count = 0;
        int max = 0;
        
        while(i < start.size() && j < start.size())    {
            if(start.get(i) < end.get(j))   {
                count++;
                i++;
            } else  {
                count--;
                j++;
            }
            max = Math.max(max,count);
        }
        
        
        
        return max;
    }
}