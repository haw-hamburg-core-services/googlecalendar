package testClient;

import de.haw_hamburg.informatik.core.calendar.CalendarEvent;
import de.haw_hamburg.informatik.core.calendar.CalendarEventCollection;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TimoHäckel on 21.02.2017.
 */
public class TestClient {
    @Test
    public void testRequestEvents() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        CalendarEventCollection events = restTemplate.getForObject("http://localhost:9000/calendar/events", CalendarEventCollection.class);
        System.out.println(events);
    }

    @Test
    public void testRequestNextEvent() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        CalendarEvent event = restTemplate.getForObject("http://localhost:9000/calendar/nextevent", CalendarEvent.class);
        System.out.println(event);
    }
}
