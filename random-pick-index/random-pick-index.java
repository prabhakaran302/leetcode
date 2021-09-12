class Solution {
    Map<Integer,List<Integer>> map;
    Random r;
    public Solution(int[] nums) {
        r = new Random();
        int index = 0;
        map = new HashMap<>();
        for(int num : nums) {
            if(!map.containsKey(num))
                map.put(num, new ArrayList<>());
            map.get(num).add(index);
            index++;
        }
            
    }
    
    public int pick(int target) {
        int size = map.get(target).size();
        return map.get(target).get(r.nextInt(size));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */