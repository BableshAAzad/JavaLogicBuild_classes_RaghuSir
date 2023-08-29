package Integerrr;
import java.util.Scanner;

class SmallestIn3IntIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integer values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c)
            System.out.println(a + " is smallest number");
        else if (b < c)
            System.out.println(b + " is smallest number");
        else
            System.out.println(c + " is smallest number");
    }
}
