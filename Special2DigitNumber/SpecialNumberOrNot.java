package Special2DigitNumber;

import java.util.Scanner;

public class SpecialNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value : ");
        int n = sc.nextInt();
        count(n);
        int[] a = new int[count(n)];
        int temp = n, i = 0, sum = 0, prod = 1;
        do {
            int r = n % 10;
            a[i] = r;
            i++;
            n = n / 10;
        } while (n > 0);
        for (int j = 0; j < a.length; j++) {
            sum = sum + a[i];
            prod = prod * a[i];
        }
        int s = sum + prod;
        if (s == temp)
            System.out.println("Special number");
        else
            System.out.println("Not a special number");

        sc.close();
    }

    static int count(int n) {
        int coun = 0;
        do {
            coun++;
            n = n / 10;
        } while (n > 0);
        return coun;
    }
}
