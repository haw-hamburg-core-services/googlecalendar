package de.haw_hamburg.informatik.core.calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TimoHäckel on 21.02.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CalendarEventCollection {

    private List<CalendarEvent> events;

    public CalendarEventCollection(List<CalendarEvent> calendarEvents) {
        events = calendarEvents;
    }

    public CalendarEventCollection() {
        events = null;
    }

    public List<CalendarEvent> getEvents() {
        return events;
    }

    public void setEvents(List<CalendarEvent> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "CalendarEventCollection{" +
                "events=" + events +
                '}';
    }
}
