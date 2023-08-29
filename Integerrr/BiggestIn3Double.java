package Integerrr;
import java.util.Scanner;

class BiggestIn3Double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Double Values : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > b && a > c)
            System.out.println(a + " is biggest double number");
        else if (b > c)
            System.out.println(b + " is biggest double number");
        else
            System.out.println(c + " is biggest double number");
    }
}
