class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
		
		List<String> result = new LinkedList<>();
		Map<String, Integer> map = new TreeMap<>();
		for (int i = 0; i < words.length; i++) {
			map.put(words[i], map.getOrDefault(words[i], 0) + 1);
		}
        System.out.println(map);
		LinkedHashMap<String,Integer> m1 = map.entrySet().parallelStream().sorted((a, b) -> b.getValue().compareTo(a.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(map);

		Iterator<String> it = m1.keySet().iterator();
		for (int i = 0; i < k; i++) {
			if (it.hasNext())
				result.add(it.next());
			else
				break;
		}
		return result;
	
	
    }
}