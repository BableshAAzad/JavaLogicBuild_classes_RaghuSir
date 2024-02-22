package Integerrr.DOBcalculate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input date of birth
        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        String dobString = scanner.nextLine();

        // Parse the input into a Date object
        Date dob = parseDateOfBirth(dobString);

        // Calculate the age
        int age = calculateAge(dob);

        // Display the result
        System.out.println("Your age is: " + age + " years");

        scanner.close();
    }

    private static Date parseDateOfBirth(String dobString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(dobString);
        } catch (ParseException e) {
            e.printStackTrace(); // Handle the exception appropriately
            return null;
        }
    }

    private static int calculateAge(Date dob) {
        Date currentDate = new Date();
        long diff = currentDate.getTime() - dob.getTime();
        
        // Calculate age in years
        long ageInMillis = diff;
        ageInMillis = ageInMillis / (24 * 60 * 60 * 1000); // Convert milliseconds to days
        int age = (int) (ageInMillis / 365.25); // Consider leap years

        return age;
    }
}
