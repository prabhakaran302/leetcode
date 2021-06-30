class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char cur : s.toCharArray())
            if(Character.isLetterOrDigit(cur))
                sb.append(cur);
        
        
        StringBuilder sbrev = new StringBuilder(sb.toString());
        return sbrev.reverse().toString().equals(sb.toString());
    }
}