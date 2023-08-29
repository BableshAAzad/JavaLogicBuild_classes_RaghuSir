package Integerrr;
import java.util.Scanner;

class OddEvenWCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value : ");
        int n = sc.nextInt();
        String[] st = {"even", "odd"};
        System.out.println(n + " is a " + st[n%2] + " number");
    }
}
