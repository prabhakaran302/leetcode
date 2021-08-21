class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        
        
        
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(intervals[0][0]);
        l.add(intervals[0][1]);
        list.add(l);
        
        int start = 1;
        int prev = 0;
        
        while(start < intervals.length) {
            if(list.get(prev).get(1) >= intervals[start][0]) {
                int prevE = list.get(prev).get(1);
                list.get(prev).set(1, Math.max(prevE, intervals[start][1]));
            } else  {
                l = new ArrayList<>();
                l.add(intervals[start][0]);
                l.add(intervals[start][1]);
                list.add(l);
                prev = list.size()-1;
            }
            start++;
        }
        
        
        int[][] res = new int[list.size()][2];
        int index = 0;
        for(List<Integer> tl : list)   {
            res[index][0] = tl.get(0);
            res[index][1] = tl.get(1);
            index++;
        }
        return res;
    }
}