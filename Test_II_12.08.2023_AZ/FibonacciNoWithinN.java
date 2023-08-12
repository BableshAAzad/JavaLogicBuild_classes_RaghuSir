import java.util.Scanner;

public class FibonacciNoWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        int fb = isFibonacci(n);
        System.out.print(fb);

    }

    static int isFibonacci(int n) {
        int a = 0, b = 1;
        while (n > 0) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            n--;
        }
        return a;
    }
}
