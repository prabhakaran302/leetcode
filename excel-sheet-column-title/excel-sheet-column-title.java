class Solution {
    public String convertToTitle(int columnNumber) {
        Map<Integer,Character> map = new HashMap<>();
		int index = 1;
		for (char cur = 'A'; cur <= 'Z'; cur++) {
			map.put(index++, cur);
		}
        StringBuilder sb = new StringBuilder();
        while(columnNumber >= 1) {
            if(columnNumber % 26 == 0)  {
                sb.append("Z");
                columnNumber /= 26;
                columnNumber--;
            }   else    {
                sb.append(map.get(columnNumber % 26));
                columnNumber /= 26;
            }
            
        }
        return sb.reverse().toString();
    }
}