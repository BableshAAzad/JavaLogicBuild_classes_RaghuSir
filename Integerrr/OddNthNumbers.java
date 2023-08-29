package Integerrr;
import java.util.Scanner;

class OddNthNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value and print all odd numbers :");
        int a = sc.nextInt();
        if (a > 0)
            for (int i = 1; i <= a; i = i + 2) {
                System.out.println(i + " ");
            }
        else
            System.out.println("Please enter greaterthen '0'");
    }
}
