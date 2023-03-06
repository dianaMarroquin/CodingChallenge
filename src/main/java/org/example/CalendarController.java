package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController

// Class
public class CalendarController {

    @GetMapping(path = "/Get", consumes = "application/json", produces = "application/json")
    public List<Availability> Post (@RequestBody Calendars ob) {
        Integer getLength = ob.calendars.get(0).calendar.length;
        List<Availability> newResponse = new ArrayList<Availability>();
        for(Integer x = 0; x< getLength; x++)
        {
            Integer amountEmployees = 0;
            List<String> employeeNames = new ArrayList<String>();
            for(Integer i = 0; i < ob.calendars.size(); i++) {
                String s = ob.calendars.get(i).calendar[x];
                if (s == null)
                {
                    amountEmployees++;
                    employeeNames.add(ob.calendars.get(i).name);
                }
            }
            if(amountEmployees >= 3)
            {
               newResponse.add(new Availability(ob.calendars.get(0).companySchedule.get(x),employeeNames));
            }
        }
        return newResponse;
    }



}