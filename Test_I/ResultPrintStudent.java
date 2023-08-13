package Test_I;

import java.util.Scanner;

public class ResultPrintStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the all 4 subjects marks :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a < 35 || b < 35 || c < 35 || d < 35)
            System.out.println("Fails");
        else {
            int total = (a + b + c + d) / 4;
            if (total >= 85 && total <= 100)
                System.out.println("Distinct");
            else if (total >= 75 && total <= 65)
                System.out.println("First");
            else if (total >= 65 && total <= 75)
                System.out.println("Second");
            else if (total >= 55 && total <= 65)
                System.out.println("Third");
            else
                System.out.println("Pass");
        }
    }
}
