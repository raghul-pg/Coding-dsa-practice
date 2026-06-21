class Solution {
    public double angleClock(int hour, int minutes) {
        double f1 = 30*hour - (5.5*minutes);
        double f = Math.abs(f1);
        if(f>180){
            double f2 = 360-f;
            return f2;
        }
        else{
            return f;
        }
        
    }
}