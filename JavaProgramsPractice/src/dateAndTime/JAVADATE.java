package dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JAVADATE {

	public static void main(String[] args) {

		JAVADATE jd = new JAVADATE();
		jd.javaDate();
		jd.javaTime();
		jd.javaTimeAndDate();
		jd.dateTimeFormatter();
	}

	public void javaDate() {
		LocalDate date = LocalDate.now();
		System.out.println("Local Current Date: " + date);
	}

	public void javaTime() {
		LocalTime time = LocalTime.now();
		System.out.println("Local Current Time: " + time);
	}

	public void javaTimeAndDate() {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Current Date and Time: " + dt);
	}

	public void dateTimeFormatter() {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Before Formatting: " + ldt);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedDate = ldt.format(format);
		System.out.println("After Formatting: " + formattedDate);

	}

}
