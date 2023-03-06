package org.example;

import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
public class Availability {
    public String time;
    public List<String> name;

    public Availability(String time, List<String> names) {
        this.time = time;
        this.name = names;
    }
    public Availability()
    {

    }
}
