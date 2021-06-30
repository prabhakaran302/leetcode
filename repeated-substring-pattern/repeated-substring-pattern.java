class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        String ns = s + s;
        ns = ns.substring(1,ns.length()-1);
        return ns.indexOf(s) != -1;
    }
}