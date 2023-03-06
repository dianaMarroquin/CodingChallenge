package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Calendars {
    @JsonProperty("calendars")
    public ArrayList<Calendar> calendars ;

    public Calendars(String [] calendars){
        ArrayList<Calendar> newCalendars;
    }
    public Calendars(){

    }
}
