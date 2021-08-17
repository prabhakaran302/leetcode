class Solution {
    Map<Integer,List<Integer>> map;
    Random r;
    public Solution(int[] nums) {
        map = new HashMap<>();
        int i = 0;
        for(int num : nums) {
            map.computeIfAbsent(num, x -> new ArrayList<Integer>()).add(i);
            i++;
        }
        r = new Random();
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