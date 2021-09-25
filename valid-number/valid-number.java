class Solution {
    public boolean isNumber(String s) {
        
		
		boolean seenDigit = false;
		boolean seenExpo = false;
		boolean seenDot = false;
        
        int index = 0;

		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				seenDigit = true;
			} else if (ch == 'e' || ch == 'E') {
				if (seenExpo || !seenDigit)
					return false;
				seenExpo = true;
				seenDigit = false;
			} else if (ch == '.') {
				if (seenDot || seenExpo)
					return false;
				seenDot = true;
			} else if (ch == '+' || ch == '-') {
                if(index != 0 && (s.charAt(index - 1) != 'e' && s.charAt(index - 1) != 'E'))
                    return false;
			} else {
				return false;
			}
            index++;
		}

		return seenDigit;
	
	
    }
}