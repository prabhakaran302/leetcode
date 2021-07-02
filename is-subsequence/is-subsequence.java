class Solution {
    public boolean isSubsequence(String s, String t) {
        Deque<Character> d = new LinkedList<>();
        for(char c :  s.toCharArray())  {
            d.offer(c);
        }
        for(char c :  t.toCharArray())  {
            if(!d.isEmpty() && d.peekFirst() == c)  {
                d.removeFirst();
            }
        }
        return d.isEmpty();
    }
}