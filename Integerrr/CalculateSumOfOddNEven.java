package Integerrr;
import java.util.Scanner;

class CalculateSumOfOddNEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intger value and calculate sum of odd and even numbers :");
        int a = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }
        System.out.println("Sum of all odd numbers is : " + sumOdd);
        System.out.println("Sum of all even numbers is : " + sumEven);
    }
}
