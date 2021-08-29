class Solution {
    public String longestPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		
        int start = 0;
        int end = 0;
		for (int index = 0; index < s.length(); index++) {
			int length1 = isPalindrome(s, index, index);
			int length2 = isPalindrome(s, index, index + 1);

			int len = Math.max(length1, length2);
			if (len > end - start) {
				start = index - (len-1)/2;
                end = index + len/2;
			}
		}

		return s.substring(start,end+1);
	}

	private int isPalindrome(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right-left-1;
	}

}