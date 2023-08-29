package Integerrr;
import java.util.Scanner;

class BiggestIn3DoubleNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three double numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double biggest = a;
        if (b > biggest)
            biggest = b;
        if (c > biggest)
            biggest = c;
        System.out.println(biggest + " is a biggest number");
    }
}
