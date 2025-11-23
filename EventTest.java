import java.time.LocalDate;
import java.time.LocalTime;
// Import JUnit libraries
import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest
{
	@Test
	public void testGetEventVars()
	{
		Event e = new Event(
				"Yoga Class",                   // title
			    LocalDate.of(2025, 11, 20),     // date
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
		assertEquals("This is the end time of event e.", LocalTime.of(18, 0), e.getEndTime());
		assertEquals("This is the category of event e.", "Social", e.getCategory());
		assertEquals("This states whether event e is weekly or not.", false, e.isWeekly());
	}
	
	@Test
	public void testInvalidTimes()
	{
		try
		{
			Event e = new Event(
					"Gym",                 			// title
					LocalDate.of(2025, 11, 18),     // date
					21,                             // startHour
					0,                              // startMinute
					19,                             // INVALID endHour
					30,                             // INVALID endMinute
					"Personal",                     // category
					true,                           // weekly recurrence
					"2 hours before"                // alert string
			);
			fail("Expected IllegalArgumentException was not thrown.");
		} catch (IllegalArgumentException e) {
			assertEquals("End time must be after start time.", e.getMessage());
		}
	}

	/*@Test
	public void testInvalidCategory()
	{
		try 
    	{
        	Event e = new Event(
                "Mystery Hunt",				// title
                LocalDate.of(2025, 9, 16),	// date
                12,							// startHour
                30,							// startMinute
                17,							// endHour
                0,							// endMinute
                "Mystery",      			// INVALID category
                true,						// weekly recurrence
                "1 hour before"				// alert string
        	);
        	fail("Expected IllegalArgumentException for invalid category.");
    	} 
    	catch (IllegalArgumentException e) 
    	{
        	assertTrue(e.getMessage().contains("Invalid category"));
    	}
	}

	// Helper constructor to be used in testAbnormalTitles()
	public Event createEventUniqueTitle(String title)
	{
		Event e = new Event(
			title,						// title FROM PARAMETER
			LocalDate.of(2025, 4, 4),	// date
            13,							// startHour
            0,							// startMinute
            14,							// endHour
            45,							// endMinute
            "Work",		      			// INVALID category
            false,						// weekly recurrence
            "1 hour before"				// alert string
		)
		return e;
	}
	
	@Test
	public void testAllNumberTitle()
	{
		Event e1 = createEventUniqueTitle("1234");
		assertEquals("This is a valid title composed of all numbers", "1234", e.getTitle());
	}
	
	@Test
	public void testAllSpecialCharsTitle()
	{
		Event e1 = createEventUniqueTitle("@+^");
		assertEquals("This is a valid title composed of all special characters", "@+^", e.getTitle());
	}

	@Test
	public void testVeryLongTitle()
	{
		Event e1 = createEventUniqueTitle("aaaaabbbbbcccccdddddeeeeefffffggggghhhhhijklmnopqrstuvwxyz");
		assertEquals("This is a valid title of a length over 50", 
					 "aaaaabbbbbcccccdddddeeeeefffffggggghhhhhijklmnopqrstuvwxyz", e.getTitle()
					);
	}*/

	
}
