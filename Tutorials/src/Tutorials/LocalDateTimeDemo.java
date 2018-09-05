package Tutorials;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

	public static void main(String[] args) {

		// LocalDateTime.now() creates a LocalDateTieme object with Current Date and Time ****/
		LocalDateTime rightNow = LocalDateTime.now();
		System.out.println("Current DateTime?= " + rightNow + "\n");

		// Formatting the Date using ISO_LOCAL_DATE 
		String isoDate = rightNow.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("ISO Formatted Date?= " + isoDate + "\n");

		// Formatting the Date using PATTERN 
		String pattern = "dd-MMM-yyyy HH:mm:ss";
		String patternDate = rightNow.format(DateTimeFormatter.ofPattern(pattern));
		System.out.println("Pattern Formatted DateTime?= " + patternDate + "\n");

		
		// LocalDateTime.of() method is a factory method to create LocalDateTiem with Specific Date and Time 
		LocalDateTime sDateTime = LocalDateTime.of(2017, Month.DECEMBER, 22, 21, 30, 40); 
		System.out.println("Some DateTime?= " + sDateTime + "\n");

		
		//Create LocalDateTime object by combining LocalDate and LocalTime
		LocalDate currentDate = LocalDate.now(); 
		LocalTime currentTime = LocalTime.now(); 
		LocalDateTime fromDateAndTime = LocalDateTime.of(currentDate, currentTime); 
		System.out.println("LocalDateTime created by combining 'LocalDate' and 'LocalTime'?= " + fromDateAndTime + "\n");

		// Developers can also retrieve LocalDate and LocalTime from LocalDateTime 
		LocalDate retrievedDate = fromDateAndTime.toLocalDate(); 
		LocalTime retrievedTime = fromDateAndTime.toLocalTime(); 
		System.out.println("Retrieved LocalDate?= " + retrievedDate + ", Retrieved LocalTime?= " + retrievedTime);		
	}
}
