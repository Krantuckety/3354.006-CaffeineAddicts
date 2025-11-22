import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
//Import JUnit libraries
import org.junit.Test;
import static org.junit.Assert.*;

public class CalendarTest
{
	private Calendar calendar;
	
	@BeforeEach
	void prepCalendar()
	{
		calendar = new Calendar();	
	}
	
	// Test 1
	@Test
	void testAddEventSuccess()
	{
		assertEquals("This test checks to see if the calendar is empty", 0, calendar.getEvents().size());
		Event e = new Event(
				"Yoga Class",                   // title
			    LocalDate.of(2025, 11, 20),     // date
			    14, 0,                          // startTime
			    18, 0,                          // endTime
			    "Social",                       // category
			    false,                          // weekly recurrence
			    "1 day before"                  // alert string
		);
		calendar.addEvent(e);
		
		assertEquals("This test checks to see if the calendar has 1 event", 1, calendar.getEvents().size());
	}
	
	// Test 2
	@Test
	void testAdd2EventsSuccess()
	{
		assertEquals("This test checks to see if the calendar is empty", 0, calendar.getEvents().size());
		Event e1 = new Event(
				"Yoga Class",                   // title
			    LocalDate.of(2025, 11, 20),     // date
			    16, 0,                          // startTime
			    18, 0,                          // endTime
			    "Social",                       // category
			    false,                          // weekly recurrence
			    "1 day before"                  // alert string
		);
		
		assertEquals("This test checks to see if the calendar is empty", 0, calendar.getEvents().size());
		Event e1 = new Event(
				"Other Yoga Class",                   // title
			    LocalDate.of(2025, 11, 22),     // date
			    16, 0,                          // startTime
			    18, 0,                          // endTime
			    "Social",                       // category
			    false,                          // weekly recurrence
			    "1 day before"                  // alert string
		);
		
		calendar.addEvent(e1);
		calendar.addEvent(e2);
		
		assertEquals("This test checks to see if the calendar has 1 event", 2, calendar.getEvents().size());
	}
	
	// Test 3
    @Test
    void testAddOverlappingEvent() {
        Event e1 = new Event(
                "Work Event",					// title
                LocalDate.of(2025, 10, 11),		// date
                9, 0,							// startTime
                10, 0,							// endTime
                "Work",							// category
                false,							// weekly recurrence
                "none"							// alert string
        );

        Event e2 = new Event(
                "Me Time",						// title
                LocalDate.of(2025, 10, 11),		// date
                9, 30,							// startTime
                10, 30,							// endTime
                "Personal",						// category
                false,							// weekly recurrence
                "none"							// alert string
        );

        calendar.addEvent(e1);

        assertThrows(IllegalArgumentException.class, () -> {
            calendar.addEvent(e2);
        });
    }
    
}
