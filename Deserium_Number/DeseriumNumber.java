package Deserium_Number;
import java.util.Scanner;

class DeseriumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The integer : ");
        int n = sc.nextInt();
        boolean rs = isDeserium(n);
        if (rs)
            System.out.println(n + " is a Deserium number");
        else
            System.out.println(n + " is not a Deserium number");
    }

    static boolean isDeserium(int n) {
        int dc = digitCount(n);
        int sum = 0, temp = n;
        do {
            int d = n % 10;
            sum = sum + power(d, dc);
            dc--;
            n = n / 10;
        } while (n != 0);
        return sum == temp;
    }

    static int digitCount(int n) {
        int count = 0;
        do {
            count++;
            n = n / 10;
        } while (n != 0);
        return count;
    }

    static int power(int d, int dc) {
        int prod = 1;
        while (dc > 0) {
            prod = prod * d;
            dc--;
        }
        return prod;
    }
}
