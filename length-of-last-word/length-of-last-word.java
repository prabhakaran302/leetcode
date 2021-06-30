class Solution {
    public int lengthOfLastWord(String s) {
        String[] c = s.split(" ");
        return c.length == 0 ? 0 : c[c.length-1].length();
    }
}