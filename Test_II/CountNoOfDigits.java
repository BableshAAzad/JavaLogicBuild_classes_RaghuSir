package Test_II;
import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        int count = 0;
        do {
            int d = n % 10;
            count++;
            n=n/10;
        } while (n > 0);
        System.out.println("There number of digits is : " + count);
    }
}
