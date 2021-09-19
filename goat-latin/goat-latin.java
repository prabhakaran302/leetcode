class Solution {
    public String toGoatLatin(String sentence) {
        int counta = 1;
        StringBuilder sb = new StringBuilder();
        
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        
        for(String str : sentence.split(" "))   {
            if(!set.contains(str.charAt(0))) {
                char cons = str.charAt(0);
                str = str.substring(1) + cons + "ma";
            } else  {
                str = str + "ma";
            }
            int val = counta;
            while(val > 0)  {
                str = str + "a";
                val--;
            }
            counta++;
            sb.append(str).append(" ");
        }
        return sb.substring(0,sb.length() - 1).toString();
    }
}