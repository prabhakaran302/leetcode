class Solution {
    public String removeOccurrences(String s, String part) {
        
		
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			res.append(s.charAt(i));
			if (res.length() >= part.length()) {
				String temp = res.substring(res.length() - part.length(), res.length());
				if (temp.equals(part))
					res = new StringBuilder(res.substring(0, res.indexOf(temp)));
			}
		}

		return res.toString();
	
	
    }
}