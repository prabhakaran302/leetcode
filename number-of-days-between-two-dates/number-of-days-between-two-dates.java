class Solution {
    public int daysBetweenDates(String date1, String date2) {
                
        int days1 = calCulateDays(date1);
        int days2 = calCulateDays(date2);
        
        return Math.abs(days1-days2);
    }
    
    public int calCulateDays(String date1) {
        String [] ds = date1.split("-");
        int y1 = Integer.parseInt(ds[0]);
        int m1 = Integer.parseInt(ds[1]);
        int d1 = Integer.parseInt(ds[2]);
        
        int days = 0;
        
        int start1 = 1971;
        while(start1 < y1)  {
            if(isLeapYear(start1))
                days += 366;
            else
                days += 365;
            
            start1++;
        }
        
        int [] mon = new int[]{0,31,0,31,30,31,30,31,31,30,31,30,31};
        for(int i = 0; i < m1;i++) {
            if(i == 2 && isLeapYear(y1))
                days += 29;
            else if(i == 2)
                days += 28;
            else days += mon[i];
        }
        
        
        
        return days + d1;
    }
    
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}