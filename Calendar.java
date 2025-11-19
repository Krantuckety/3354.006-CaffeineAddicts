import java.time.LocalDate;
import java.util.ArrayList;

public class Calendar {

    private final ArrayList<Event> events;

    public Calendar() {
        this.events = new ArrayList<>();
    }

    // Add Event method
    public void addEvent(Event newEvent) {
        // Check for overlap before adding
        for (Event e : events) {
            // Only compare if on the same date
            if (e.getDate().equals(newEvent.getDate())) {
                if (timesOverlap(e, newEvent)) {
                    throw new IllegalArgumentException("Event overlaps with an existing event.");
                }
            }
        }
        events.add(newEvent);
    }

    // Helper method your classmate can write unit tests for
    public boolean timesOverlap(Event a, Event b) {
        return a.getStartTime().isBefore(b.getEndTime())
                && b.getStartTime().isBefore(a.getEndTime());
    }

    public ArrayList<Event> getEvents() {
        return events;
    }
}
