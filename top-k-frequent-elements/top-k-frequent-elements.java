import java.util.Map;
import java.util.Map.Entry;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		Map<Integer, Integer> ml = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		int[] res = new int[k];
		int index = 0;
		for (Map.Entry<Integer, Integer> m : ml.entrySet()) {
            res[index] = m.getKey();
            index++;
            if(index == k)
                break;
        }
        
        return res;
	
    }
}