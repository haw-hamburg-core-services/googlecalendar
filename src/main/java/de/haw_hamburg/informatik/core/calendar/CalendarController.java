package de.haw_hamburg.informatik.core.calendar;

import com.google.api.services.calendar.model.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by TimoHäckel on 20.02.2017.
 */
@RestController
public class CalendarController {

    @RequestMapping("/calendar/events")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//        try {
//            return CalendarAccess.getNextEvents();
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
        return "asd";
    }


}
