import java.util.Scanner;

class PrimeNOWithinMandN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of M and N : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            boolean rs = ismPrime(i);
            if (rs)
                System.out.print(i + " ");
        }
    }

    static boolean ismPrime(int x) {
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
