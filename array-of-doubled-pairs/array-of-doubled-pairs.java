class Solution {
    public boolean canReorderDoubled(int[] arr) {
		
		
		if (arr.length % 2 != 0)
			return false;

		Map<Integer, Integer> map = new HashMap<>();
		Arrays.sort(arr);

		for (int index = arr.length - 1; index >= 0; index--) {
			int num = arr[index];
            
			if (num < 0) {
                if (num % 2 != 0) {
				    map.put(num, map.getOrDefault(num, 0) + 1);
				    continue;
                }
				if (map.isEmpty() || !map.containsKey(num / 2)) {
					map.put(num, map.getOrDefault(num, 0) + 1);
				} else {
					map.put(num / 2, map.get(num / 2) - 1);
					if (map.get(num / 2) == 0)
						map.remove(num / 2);
				}
			} else {
				if (map.isEmpty() || !map.containsKey(num * 2)) {
					map.put(num, map.getOrDefault(num, 0) + 1);
				} else {
					map.put(num * 2, map.get(num * 2) - 1);
					if (map.get(num * 2) == 0)
						map.remove(num * 2);
				}
			}
		}

		if (map.size() != 0)
			return false;
		return true;
	
	
	}
}