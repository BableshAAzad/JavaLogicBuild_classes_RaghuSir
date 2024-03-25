package Stringgg.DOB;

import java.time.*;
import java.util.Date;

public class CalculateAgeExample2 {
	public static void main(String args[]) {
		// obtains an instance of LocalDate from a year, month and date
		LocalDate dob = LocalDate.of(1995, 06, 28);
		// obtains the current date from the system clock
		LocalDate curDate = LocalDate.now();
//		LocalDate curDate = LocalDate.of(1998, 12, 25);
		// calculates the difference betwween two dates
		Period period = Period.between(dob, curDate);
		// prints the differnce in years, months, and days
		System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(),
				period.getDays());
	}
}

