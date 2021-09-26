class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length <= 1)
            return strs[0];
        
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Math.min(strs[0].length(), strs[strs.length - 1].length()); i++)   {
            if(strs[0].charAt(i) == strs[strs.length - 1].charAt(i))  {
                sb.append(strs[0].charAt(i));
            } else  {
                break;
            }
        }
        
        return sb.toString();
    }
}