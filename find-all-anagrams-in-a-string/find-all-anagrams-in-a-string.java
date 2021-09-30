class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
		List<Integer> res = new ArrayList<>();
		int[] pmap = new int[26];
		for (char c : p.toCharArray()) {
			pmap[c - 'a']++;
		}

		for (int i = 0; i < s.length() - p.length() + 1; i++) {
			String cur = s.substring(i, i + p.length());

			int[] smap = new int[26];
			for (char c : cur.toCharArray()) {
				smap[c - 'a']++;
			}

			for (int j = 0; j < 26; j++) {
				if (pmap[j] != smap[j])
					break;
				else {
					smap[j] = 0;
				}
			}

			int ind = 0;
			for (int j = 0; j < 26; j++) {
				if (smap[j] != 0)
					break;
				if (smap[j] == 0)
					ind++;
			}

			if (ind == 26)
				res.add(i);

		}

		return res;
	
    }
}