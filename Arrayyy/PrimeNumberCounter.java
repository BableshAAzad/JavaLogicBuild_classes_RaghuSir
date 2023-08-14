package Arrayyy;

public class PrimeNumberCounter {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }

    // Method to count prime numbers in an array
    public static int countPrimeNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 3, 5, 7, 10, 11, 13, 17, 20 };
        int primeCount = countPrimeNumbers(numbers);
        System.out.println("Number of prime numbers in the array: " + primeCount);
    }
}

