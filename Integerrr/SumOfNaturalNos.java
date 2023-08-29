package Integerrr;
import java.util.Scanner;

class SumOfNaturalNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.print("Sum of first " + n + " Natural number is : " + sum);

    }
}
