class Solution {
    public String longestCommonPrefix(String[] strs) {
        
		
		String compareStr = strs[0];
		StringBuilder sb = new StringBuilder();
		for (int charIndex = 0; charIndex < compareStr.length(); charIndex++) {
			char curChar = compareStr.charAt(charIndex);
			for (int strsIndex = 0; strsIndex < strs.length; strsIndex++) {
				if (strs[strsIndex].length() == charIndex || strs[strsIndex].charAt(charIndex) != curChar)
					return sb.length() > 0 ? sb.toString() : "";
			}
			sb.append(curChar);
		}
		return sb.length() > 0 ? sb.toString() : "";
	
	
    }
}