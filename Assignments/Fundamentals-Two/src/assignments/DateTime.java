package assignments;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class DateTime {

public static void displayDateTime() {
		
		//current date
		 LocalDate date = LocalDate.now(); 
		 System.out.println("The current date is "+ date); 
		
		 // the current time 
		 LocalTime time = LocalTime.now(); 
		 System.out.println("The current time is "+ time); 
	}
	
//	public static final class DateUtility {
//
//	    private DateUtility() {}
//	    
//	    public static LocalDate getEndOfCurrentMonth() {
//	        return LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
//	    }
//
//	}
	

	public static void main(String[] args) {
		displayDateTime(); 
		Calendar c = Calendar.getInstance();
		System.out.println(c.getActualMaximum(Calendar.DATE));
	}



}
