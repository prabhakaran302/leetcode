class Solution {
    public int maximumSwap(int num) {
        char [] ch = String.valueOf(num).toCharArray();
        
        int maxPos = ch.length - 1;
        int[] maxIdx = new int[ch.length];
        maxIdx[maxPos] = maxPos;
        
        int j = ch.length - 2;
        while(j >= 0)   {
            if(ch[j]-'0' > ch[maxPos]-'0') {
                maxPos = j;
            }
             maxIdx[j--] = maxPos;
        }
        
        for(int i = 0; i < ch.length; i++)  {
            if(ch[i]-'0' != ch[maxIdx[i]] - '0')  {
                char temp = ch[maxIdx[i]] ;
                ch[maxIdx[i]] = ch[i];
                ch[i] = temp;
                return Integer.parseInt(String.valueOf(ch));
            }
        }
        
        return num;
    }
}