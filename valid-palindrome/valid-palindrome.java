class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c))
                sb.append(c);
            
        }
        
        return sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase());
    }
}