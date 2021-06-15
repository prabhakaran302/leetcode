class Solution {
    public double angleClock(int hour, int minutes) {
        double res = 0;
        int minangle = 6;
        int hrangle = 30;
        
        double hranglepermin = ((hour % 12) * 30) + (minutes * 0.5);
        System.out.println(hranglepermin);
        double minres = minutes*6;
        
        res = Math.min(360-Math.abs(hranglepermin-minres), Math.abs(hranglepermin-minres));
        
        return res;
    }
}