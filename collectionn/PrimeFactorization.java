package collectionn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {
    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        while (number % 2 == 0) {
            primeFactors.add(2);
            number /= 2;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }
        if (number > 2) {
            primeFactors.add(number);
        }

        return primeFactors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        List<Integer> primeFactors = getPrimeFactors(number);

        System.out.println("Prime factorization of " + number + ": " + primeFactors);
        scanner.close();

        // Enter a positive integer: 24
        // Prime factorization of 24: [2, 2, 2, 3]
    }
}
