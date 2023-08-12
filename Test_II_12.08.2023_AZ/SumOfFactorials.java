import java.util.*;

public class SumOfFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        int f = sumFacto(n);
        System.out.println(f);
    }

    static int sumFacto(int n) {
        int sum = 0;
        do {
            int d = n % 10;
            sum = sum + fact(d);
            n = n / 10;
        } while (n > 0);
        return sum;
    }

    static int fact(int n) {
        int count = 1, y = n;
        while (n > 0) {
            count = count * n;
            n--;
        }
        return count;
    }

}
