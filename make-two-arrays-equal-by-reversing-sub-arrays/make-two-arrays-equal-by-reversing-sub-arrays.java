class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : arr)
            map.put(i,map.getOrDefault(i,0)+1);
        
        for(Integer t : target)
            if(map.containsKey(t))  {
                int count = map.get(t);
                map.put(t, count - 1);
                
                if(count == 1)
                    map.remove(t);
                
                
            }
            else
                return false;
        
        return map.size() == 0;
    }
}