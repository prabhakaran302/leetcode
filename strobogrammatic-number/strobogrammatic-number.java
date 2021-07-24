class Solution {
    public boolean isStrobogrammatic(String num) {
        
		Map<Integer, Integer> map = new HashMap<>();
		map.put(6, 9);
		map.put(9, 6);
		map.put(0, 0);
		map.put(1, 1);
		map.put(8, 8);

		int low = 0;
		int high = num.length() - 1;

		while (low <= high) {
			int ln = Integer.parseInt(String.valueOf(num.charAt(low)));
			int rn = Integer.parseInt(String.valueOf(num.charAt(high)));

			if (!map.containsKey(ln) || !map.containsKey(rn) || ln != map.get(rn))
				return false;
			low++;
			high--;

		}

		return true;
	
    }
}