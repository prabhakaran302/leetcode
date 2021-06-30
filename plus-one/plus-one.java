class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i = digits.length - 1; i >= 0; i--)  {
            int sum = digits[i] + carry + (i == digits.length - 1 ? 1 : 0);
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        
        int size = digits.length;
        
        if(carry == 1)
            size = digits.length + 1;
        
        int[] res = new int[size];
        int index = size - 1;
        for(int di = digits.length - 1; di >= 0; di--)  {
            res[index--] = digits[di];
        }
        
        if(index == 0)
            res[index--] = carry;
        
        return res;
    }
}