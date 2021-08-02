class Solution {
    public boolean checkInclusion(String s1, String s2) {
        for(int i = 0; i <= s2.length() - s1.length(); i++)  {
            if(isPerm(s1, s2.substring(i, i + s1.length())))
                return true;
        }
        
        return false;
    }
    
    public boolean isPerm(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        for(int i = 0; i < c1.length; i++)
            if(c1[i] != c2[i])
                return false;
        
        return true;
    }
}