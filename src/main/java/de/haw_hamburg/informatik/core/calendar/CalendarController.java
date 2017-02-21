package de.haw_hamburg.informatik.core.calendar;

import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventAttendee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by TimoHäckel on 20.02.2017.
 */
@RestController
public class CalendarController {

    @RequestMapping("/calendar/events")
    public CalendarEventCollection getCalendarEvents() {
        try {
            return new CalendarEventCollection(convertEvents(CalendarAccess.getNextEvents()));
        } catch (IOException e) {
            e.printStackTrace();
            return new CalendarEventCollection(new ArrayList<>());
        }
    }
    @RequestMapping("/calendar/nextevent")
    public CalendarEvent getCalendarNextEvent() {
        try {
            return convertFirstEvents(CalendarAccess.getNextEvents());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    private CalendarEvent convertFirstEvents(List<Event> nextEvents) {

        CalendarEvent event = null;
        if( nextEvents != null) {
            Event next = nextEvents.get(0);
                //Extract data from events according to CalendarEvent types
                String title = next.getSummary();

                String location = next.getLocation();

                DateTime eventStartTime = next.getStart().getDateTime();
                Date startTime = null;
                if(eventStartTime != null){
                    startTime = new Date(eventStartTime.getValue());
                }

                DateTime eventEndTime = next.getEnd().getDateTime();
                Date endTime = null;
                if(eventStartTime != null){
                    endTime = new Date(eventEndTime.getValue());
                }

                String description = next.getDescription();

                List<String> attendees = new ArrayList<>();
                List<EventAttendee> eventAttendees = next.getAttendees();
                if(eventAttendees != null){
                    for (EventAttendee attendee : eventAttendees){
                        attendees.add(attendee.getDisplayName());
                    }
                }

                //create event and add it.
                event = new CalendarEvent(title, location, startTime, endTime, description, attendees);
        }
        return event;
    }

    private List<CalendarEvent> convertEvents(List<Event> nextEvents) {
        List<CalendarEvent> events = new ArrayList<>();

        if( nextEvents != null) {
            for (Event next : nextEvents) {
                //Extract data from events according to CalendarEvent types
                String title = next.getSummary();

                String location = next.getLocation();

                DateTime eventStartTime = next.getStart().getDateTime();
                Date startTime = null;
                if(eventStartTime != null){
                    startTime = new Date(eventStartTime.getValue());
                }

                DateTime eventEndTime = next.getEnd().getDateTime();
                Date endTime = null;
                if(eventStartTime != null){
                    endTime = new Date(eventEndTime.getValue());
                }

                String description = next.getDescription();

                List<String> attendees = new ArrayList<>();
                List<EventAttendee> eventAttendees = next.getAttendees();
                if(eventAttendees != null){
                    for (EventAttendee attendee : eventAttendees){
                        attendees.add(attendee.getDisplayName());
                    }
                }

                //create event and add it.
                events.add(new CalendarEvent(title, location, startTime, endTime, description, attendees));

            }
        }
        return events;
    }


}
