class Solution {
    public boolean isNumber(String s) {
        
		boolean seenDigit = false;
		boolean seenExpo = false;
		boolean seenSign = false;
		boolean seenDot = false;

		for (int i = 0; i < s.length(); i++) {
			
			if (Character.isDigit(s.charAt(i))) {
				seenDigit = true;
			} else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
				if (seenSign)
					return false;

				if (i == 0) {
					seenSign = true;
					continue;
				}

				if (s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E') {
					seenSign = true;
					continue;
				}
                else {
					return false;
				}
			} else if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
				if (seenExpo || !seenDigit)
					return false;
				seenExpo = true;
				seenDigit = false;
				seenSign = false;
			} else if (s.charAt(i) == '.') {
				if (seenDot || seenExpo)
					return false;
				seenDot = true;
			} else
				return false;
		
		}

		return seenDigit;
	
    }
}