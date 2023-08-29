package Integerrr;
import java.util.Scanner;

class BigIn2Int1If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integer values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int big = a;

        if (b > big)
            big = b;
        System.out.println(big + " is a Biggest value");
    }
}
