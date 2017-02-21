package de.haw_hamburg.informatik.core.calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by TimoHäckel on 21.02.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CalendarEvent {

    private String title;
    private String location;
    private Date startTime;
    private Date endTime;
    private String description;
    private List<String> attendees;


    public CalendarEvent(String title, String location, Date startTime, Date endTime, String description, List<String> attendees) {
        this.title = title;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.attendees = attendees;
    }

    public CalendarEvent() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<String> attendees) {
        this.attendees = attendees;
    }

    @Override
    public String toString() {
        return "CalendarEvent{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", description='" + description + '\'' +
                ", attendees=" + attendees +
                '}';
    }
}
