package MIITestINumberSystem.TestINumberSystem;

import java.util.Scanner;

// eg. 5 = 5*5 = 25 last digits are match 5
// eg. 76 = 76*76 = 5776 last digits are match 76
// eg. 25 = 25*25 = 625 last digits are match 25
public class AutomorphicNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number : ");
        int n = sc.nextInt();
        System.out.println(isAutomorphic(n) ? "Automorphic" : "Not Automorphic");
        sc.close();
    }

    static boolean isAutomorphic(int n) {
        int pow = n * n;
        while (n > 0) {
            if (n % 10 != pow % 10)
                return false;
            n = n / 10;
            pow = pow / 10;
        }
        return true;
    }
}
