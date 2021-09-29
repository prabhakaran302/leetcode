class Solution {
    public int minMeetingRooms(int[][] intervals) {
        List<Interval> li = new ArrayList<>();
        for(int[] cur :  intervals)    {
            Interval i1 = new Interval(cur[0] , "start");
            Interval i2 = new Interval(cur[1] , "end");
            li.add(i1);
            li.add(i2);
        }
        Collections.sort(li, (a,b) -> (a.val == b.val ? (a.type.equals("start") ? 1 : -1) : (a.val - b.val)));
        
        int result = 0;
        int max = 0;
        for(Interval i : li)    {
            if(i.type.equals("start"))
                result++;
            else
                result--;
            max = Math.max(max,result);
        }
        return max;
    }
    
    
    class Interval implements Comparable<Interval> {
        int val;
        String type;
        
        Interval(int v, String t) {
            val = v;
            type = t;
        }
        
        public int compareTo(Interval v)    {
            if(this.val == v.val)   {
                if(this.type.equals("start"))
                    return 1;
                else
                    return -1;
            } else  {
                return this.val - v.val;
            }
        }
    }
}