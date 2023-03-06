package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Calendar {

    String name;
    String[] meetings;
    String[] calendar;
    List<String> companySchedule = new ArrayList<String>(Arrays.asList(
            "8:00AM", "8:30AM","9:00AM", "9:30AM","10:00AM", "10:30AM","11:00AM", "11:30AM","12:00PM","12:30PM",
            "1:00PM", "1:30PM","2:00PM", "2:30PM","3:00PM","3:30PM","4:00PM", "4:30PM","5:00PM"
    ));

    public Calendar(String name, String[] meetings) {
        this.name = name;
        this.meetings = meetings;
        this.calendar = createCalendar(meetings);
    }

    public String[] createCalendar(String[] meetings)
    {
        String[] calendar = new String[(companySchedule.size())];
        for(String x: meetings)
        {
           Integer timeSlot = companySchedule.indexOf(x);
           if(timeSlot >= 0) {
               calendar[timeSlot] = "M";
           }
        }
        // log lunch times for all employees
        calendar[companySchedule.indexOf("12:00PM")] = "L";
        calendar[companySchedule.indexOf("12:30PM")] = "L";
        return calendar;
    }
}

