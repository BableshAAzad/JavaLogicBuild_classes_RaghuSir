package Stringgg.DOB;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeCalculatorExample3 {
	public static void main(String args[]) {
		LocalDate startDate = LocalDate.of(1995, 06, 28);
		LocalDate endDate = LocalDate.of(1998, 12, 25); // alternative of LocalDate.now() method
		// calculates the amount of time between two specified temporal objects
		long years = ChronoUnit.YEARS.between(startDate, endDate);
		long months = ChronoUnit.MONTHS.between(startDate, endDate);
		long days = ChronoUnit.DAYS.between(startDate, endDate);
		// prints age in years
		System.out.println("You are " + years + " years old. Months : "+months +", Days : "+days);
		System.out.println(startDate);
		System.out.println(endDate);
	}
}
