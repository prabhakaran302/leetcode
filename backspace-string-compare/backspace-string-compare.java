class Solution {
    public boolean backspaceCompare(String s, String t) {

		s = getBackSpaceString(s);
		t = getBackSpaceString(t);
		return s.equals(t);

	}

	private String getBackSpaceString(String s) {
		StringBuilder sb = new StringBuilder();
		int i = 0;

		Stack<Character> st = new Stack<>();
		while (i < s.length()) {
			if (s.charAt(i) == '#') {
                if(!st.isEmpty())
				    st.pop();
			} else {
				st.push(s.charAt(i));
			}
			i++;
		}
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		return sb.reverse().toString();
	}
}