package Stringgg.DOB;

import java.util.Calendar;  
import java.util.GregorianCalendar;

public class AgeCalculatorExample4 {
	public static void main(String args[]) {
		// creating a constructor of the Calendar class and passing DOB as a parameter
		Calendar dob = new GregorianCalendar(1995, 06, 20);
		//
		Calendar currentDate = new GregorianCalendar();
		// determines the year of DOB and current date
		int age = currentDate.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
		if ((dob.get(Calendar.MONTH) > currentDate.get(Calendar.MONTH))
				|| (dob.get(Calendar.MONTH) == currentDate.get(Calendar.MONTH)
						&& dob.get(Calendar.DAY_OF_MONTH) > currentDate.get(Calendar.DAY_OF_MONTH))) {
			// decrements age by 1
			age--;
		}
		// prints the age
		System.out.println("Your age is: " + age);
	}
}

