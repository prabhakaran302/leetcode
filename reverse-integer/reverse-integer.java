class Solution {
    public int reverse(int x) {
        
        boolean neg = x < 0 ? true : false;
        x = Math.abs(x);
        
        int rev = 0;
        while(x > 0)    {
            int quo = x % 10;
            x = x/10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && quo > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && quo < -8)) return 0;
            rev = rev*10 + quo; 
        }
        
        if(neg)
            return 0 - rev;
        
        return rev;
    }
}