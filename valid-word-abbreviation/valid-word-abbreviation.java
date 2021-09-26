class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int wi = 0;
        int ai = 0;
        
        while(wi < word.length() && ai < abbr.length()) {
            if(word.charAt(wi) == abbr.charAt(ai))  {
                wi++;
                ai++;
                continue;
            }
            
            char cur = abbr.charAt(ai);
            if(!Character.isDigit(cur) || cur == '0')
                return false;
            
            int start = ai;
            while(ai < abbr.length() && Character.isDigit(abbr.charAt(ai))) {
                ai++;
            }
            Integer num = Integer.parseInt(abbr.substring(start, ai));
            wi += num;
        }
        
        return wi == word.length() && ai == abbr.length();
    }
}