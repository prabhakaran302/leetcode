class Solution {
    public int romanToInt(String s) {
		
		int val = 0;
		for (int i = 0; i < s.length(); i++) {
			int s1 = getVal(s.charAt(i));
			if (i + 1 < s.length()) {
				int s2 = getVal(s.charAt(i + 1));
				if (s1 >= s2) {
					val += s1;
				} else {
					val = val + s2 - s1;
					i++;
				}
			} else {
				val += s1;
			}
		}
		return val;
	
	}

	public int getVal(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;

		}
		return -1;
	}
}