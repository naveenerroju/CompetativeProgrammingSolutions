package com.naveen.DSA.hackerrank.warmup;
/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
*/

public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        String day = s.substring(8,10);
        String hours = s.substring(0,2);
        String military = "";
        int hoursTime = Integer.parseInt(hours);

        //System.out.println("Given: "+s);
        //System.out.println("Day: "+day);
        //System.out.println("hours: "+hours);

        //System.out.println("hours in int: "+hoursTime);

        if(day.equals("PM") && hoursTime<12){
            military+=(12+hoursTime)+s.substring(2,8);
        } else if(day.equals("AM") && hoursTime==12) {
            military+=("00")+s.substring(2,8);
        } else {
            military += s.substring(0,8);
        }

        return military;
    }

}
