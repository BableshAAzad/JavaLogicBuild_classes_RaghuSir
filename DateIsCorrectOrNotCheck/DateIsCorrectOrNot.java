package DateIsCorrectOrNotCheck;

import java.util.Scanner;

public class DateIsCorrectOrNot {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date (dd mm yyyy) : ");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();
        if (dd < 1 || dd > 31 || mm < 1 || mm > 12 || yyyy < 1)
            System.out.println("Invalid");
        else if ((mm == 4 || mm == 6 || mm == 9 || mm == 11) && dd > 30)
            System.out.println("Invalid");
        else if ((mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) && dd > 31)
            System.out.println("Invalid");
        else if (mm == 2 && dd > 29)
            System.out.println("Invalid");
        else if ((yyyy % 4 == 0 && yyyy % 100 != 0 || yyyy % 400 == 0) == false && mm == 2 && dd > 28)
            System.out.println("Invalid");
        else
            System.out.println("Valide");
    }
}
