class Solution {
    public int minAddToMakeValid(String s) {
        int bal = 0;
        int ans = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                bal++;
            else
                bal--;
            
            if(bal == -1) {
                ans++;
                bal = 0 ;
            }
        }
        return ans + bal;
    }
}