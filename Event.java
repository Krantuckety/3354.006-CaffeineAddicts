import java.time.LocalDate;
import java.time.LocalTime;

public class Event 
{

    private final String title;
    private final LocalDate date;
    private final LocalTime startTime;
    private final LocalTime endTime;
    private final String category;
    private final boolean weekly;
    private final String alert;

    // Allowed categories
    private static final String[] VALID_CATEGORIES = 
    {
            "Work", "Personal", "Social", "Educational"
    };

    public Event(String title,
                 LocalDate date,
                 int startHour,
                 int startMinute,
                 int endHour,
                 int endMinute,
                 String category,
                 boolean weekly,
                 String alert) 
    {

        this.title = title;
        this.date = date;

        // Validate and create LocalTime values
        this.startTime = LocalTime.of(startHour, startMinute);
        this.endTime = LocalTime.of(endHour, endMinute);

        if (!endTime.isAfter(startTime)) 
        {
            throw new IllegalArgumentException("End time must be after start time.");
        }

        // Validate category
        boolean valid = false;
        for (String c : VALID_CATEGORIES) 
        {
            if (c.equalsIgnoreCase(category)) 
            {
                valid = true;
                break;
            }
        }
        if (!valid) 
        {
            throw new IllegalArgumentException
            (
                    "Invalid category. Must be one of: Work, Personal, Social, Educational."
            );
        }

        this.category = category;
        this.weekly = weekly;
        this.alert = alert;
    }

    public LocalDate getTitle() 
    {
        return date;
    }
    
    public LocalDate getDate() 
    {
        return date;
    }

    public LocalTime getStartTime() 
    {
        return startTime;
    }

    public LocalTime getEndTime() 
    {
        return endTime;
    }
    
    public getCategory() 
    {
    	return category;
    }
    
    public boolean isWeekly() 
    {
    	return weekly;
    }
}
