package Integerrr;
import java.util.Scanner;

class DigitsPresentInNthNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int n = sc.nextInt();
        int count = 0;
        do {
            count++;
            n = n / 10;
        } while (n != 0);
        System.out.println(count + " numbers disit present in here");
    }
}
