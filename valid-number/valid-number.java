class Solution {
    public boolean isNumber(String s) {
        
		boolean seenDigit = false;
		boolean seenExpo = false;
		boolean seenDot = false;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				seenDigit = true;
			} else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
				if (i == 0)
					continue;
				if(s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
					return false;
			} else if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                if (!seenDigit)
					return false;
				if (seenExpo)
					return false;
				seenExpo = true;
				seenDigit = false;
			} else if (s.charAt(i) == '.') {
				if (seenExpo || seenDot)
					return false;
				seenDot = true;
			} else  {
                return false;
            }
		}

		return seenDigit;
	
    }
}