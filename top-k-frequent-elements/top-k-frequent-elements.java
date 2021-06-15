import java.util.Map;
import java.util.Map.Entry;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		Comparator<Map.Entry<Integer, Integer>> comp = new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		};
		PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<Map.Entry<Integer, Integer>>(comp);
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			q.offer(m);
			if (q.size() > k)
				q.remove();
		}

		int[] res = new int[k];
		int c = 0;
		for (Map.Entry<Integer, Integer> m : q)
			res[c++] = m.getKey();

		return res;
	
    }
}