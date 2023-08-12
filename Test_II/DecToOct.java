package Test_II;
import java.util.Scanner;

public class DecToOct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        String oct = "";
        do {
            int d = n % 8;
            oct = oct + d;
            n = n / 8;
        } while (n > 0);
        System.out.println(oct);
    }
}
