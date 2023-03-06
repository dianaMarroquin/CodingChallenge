import org.example.Availability;
import org.example.Calendar;
import org.example.CalendarController;
import org.example.Calendars;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;

public class AvailabilityTest {
    @Mock
    private Calendars calendars = new Calendars();
    @InjectMocks
    private CalendarController service = new CalendarController();
    @Test
    public void testAvailability(){
        ArrayList<Calendar> all = new ArrayList<Calendar>();
        all.add(new Calendar("Kyle", new String[]{"8:00AM", "3:00PM"}));
        all.add(new Calendar("Luis", new String[]{"8:00AM"}));
        all.add(new Calendar("Paul", new String[]{"8:00AM", "3:30PM"}));
        all.add(new Calendar("Alex", new String[]{"8:00AM", "4:00PM"}));
        calendars.calendars = all;
        List<Availability> response = service.getAvailability(calendars);
        assert !response.contains("8:00AM");
        assert !response.contains("3:00PM");
        assert !response.contains("3:30PM");
        assert !response.contains("4:00PM");
        assert !response.get(11).name.contains("Kyle");
    }

}
