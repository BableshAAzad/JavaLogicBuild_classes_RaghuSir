package Integerrr;
import java.util.Scanner;

class OddNthNumbersIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intger value and print all odd numbers :");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0)
                System.out.println(i + " ");
        }
    }
}
