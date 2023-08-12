package Test_II;
import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        int a = 0, b = 0;
        do {
            int d = n % 10;
            a = d;
            b = n;
            System.out.print(a + "");
            n = n / 10;
        } while (n > 0);
    }
}
