import java.time.LocalDate;
import java.time.LocalTime;
// Import JUnit libraries
import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest
{
	// For the following getVar methods, the event object below is used
	public void testGetEventVars()
	{
		Event e = new Event(
				"Yoga Class",                 // title
			    LocalDate.of(2025, 11, 20),      // date
			    14,                             // startHour
			    30,                             // startMinute
			    18,                             // endHour
			    0,                              // endMinute
			    "Social",                       // category
			    false,                          // weekly recurrence
			    "1 day before"                  // alert string
				);
		assertEquals("This is the title of event e.", "Yoga Class", e.getTitle());
		assertEquals("This is the date of event e.", LocalDate.of(2025,  11, 20), e.getDate());
		assertEquals("This is the start time of event e.", LocalTime.of(14, 30), e.getStartTime());
		assertEquals("This is the end time of event e.", LocalTime.of(18, 0), e.getTitle());
		assertEquals("This is the category of event e.", "Social", e.getCategory());
		assertEquals("This states whether event e is weekly or not.", false, e.isWeekly());
		assertEquals("This is the alert of event e.", "1 day before", e.getAlert());
	}
}
