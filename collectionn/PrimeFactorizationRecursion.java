package collectionn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorizationRecursion {
    public static void getPrimeFactors(int number, List<Integer> primeFactors) {
        if (number == 1) {
            return;
        }
        if (number % 2 == 0) {
            primeFactors.add(2);
            getPrimeFactors(number / 2, primeFactors);
        } else {
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    primeFactors.add(i);
                    getPrimeFactors(number / i, primeFactors);
                    return;
                }
            }
            primeFactors.add(number);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        List<Integer> primeFactors = new ArrayList<>();

        getPrimeFactors(number, primeFactors);
        System.out.println("Prime factorization of " + number + ": " + primeFactors);

        scanner.close();

        // Enter a positive integer: 24
        // Prime factorization of 24: [2, 2, 2, 3]
    }

}
