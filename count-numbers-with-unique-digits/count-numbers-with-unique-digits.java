class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        return getNoDigit(n);
        
    }
    
    public static int getNoDigit(int n)   {
        int a = 1;
        int b = 10;
        
        int[] arr = new int[10];
        int[] uni = new int[10];
        
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 91;
        
        uni[0] = 1;
        uni[1] = 10;
        uni[2] = 81;
        
        int k = 8;
        
        for(int i = 3; i<10; i++)    {
            uni[i] = uni[i-1] * k;
            arr[i] = uni[i] + arr[i-1];
            k--;
        }
        
        return arr[n];
    }
}