class Solution {
    public double angleClock(int hour, int minutes) {
        
        double ma = minutes * 6;
        double ha = ((hour%12) + (minutes/60.0))*30;
        
        double diff = Math.abs(ma - ha);
        
        return Math.min(diff, 360 - diff);
    }
}