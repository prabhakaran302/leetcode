class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        
        int carry = 0;
        
        int n1Index = num1.length()-1;
        int n2Index = num2.length()-1;
        
        while(n1Index >= 0 || n2Index >= 0) {
            int n1 = n1Index >= 0 ? Integer.parseInt(String.valueOf(num1.charAt(n1Index))) : 0;
            int n2 = n2Index >= 0 ? Integer.parseInt(String.valueOf(num2.charAt(n2Index))) : 0;
            
            int sum = carry + n1 + n2;
            
            sb.append(sum%10);
            
            carry = sum/10;
            
            
            
            n1Index--;
            n2Index--;
        }
        
        if(carry > 0)
            sb.append(carry);
        
        return sb.reverse().toString();
    }
}