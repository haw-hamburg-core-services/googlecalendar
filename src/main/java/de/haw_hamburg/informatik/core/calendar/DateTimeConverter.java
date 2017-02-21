package de.haw_hamburg.informatik.core.calendar;

import com.google.api.client.util.DateTime;

/**
 * Created by TimoHäckel on 21.02.2017.
 */
public class DateTimeConverter {
    private DateTime originalTime;

    public DateTimeConverter(DateTime originalTime) {
        this.originalTime = originalTime;
    }

    public java.util.Date getDate() {
        return new java.util.Date(originalTime.getValue());
    }
}
