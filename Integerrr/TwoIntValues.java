package Integerrr;
import java.util.Scanner;

class TwoIntValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Intiger value A : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Intiger value B : ");
        int b = sc.nextInt();

        int sum = a + b;
        int mux = a * b;
        int sub = a - b;
        int div = a / b;
        int mod = a % b;
        System.out.println("A+B : " + sum);
        System.out.println("A*B : " + mux);
        System.out.println("A-B : " + sub);
        System.out.println("A/B : " + div);
        System.out.println("A%B : " + mod);
    }
}
