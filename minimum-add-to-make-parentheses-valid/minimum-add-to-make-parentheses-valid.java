class Solution {
    public int minAddToMakeValid(String s) {
        
		int open = 0;
		int bal = 0;

		for (char c : s.toCharArray()) {
			if (c == '(')
				open++;
			else {
				open--;
				if (open < 0) {
					open = 0;
					bal++;
				}
			}
		}

		return open + bal;
	
    }
}