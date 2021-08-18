class Solution {
    public String makeFancyString(String s) {
        StringBuilder output = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;
        
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == prev) {
                count++;
            } else  {
                output.append(prev);
                if(count >= 2)
                    output.append(prev);
                
                prev = s.charAt(i);
                count = 1;
            }
        }
        
        output.append(prev);
        if(count >= 2)
            output.append(prev);
        
        return output.toString();
    }
}