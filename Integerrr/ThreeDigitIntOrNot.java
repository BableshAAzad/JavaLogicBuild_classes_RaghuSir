package Integerrr;
import java.util.Scanner;

class ThreeDigitIntOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer Value : ");
        int a = sc.nextInt();

        if (a<-1000 && a>-100  || a<1000 && a>100)
            System.out.println(a + " is a three digit number");
        else
            System.out.println(a + " is not a three digit number");
    }
}
