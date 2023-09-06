package Test_VI_Array;

public class PrimePelindromeQ3 {
    public static void main(String[] args) {
        int[] ar = MainClassVII.readArrayy();
        System.out.println("Here prime pelindrome number is : ");
        for (int i = 0; i < ar.length; i++) {
            boolean bl = isPelindrome(ar[i]);
            if (bl)
                System.out.println(ar[i]);
        }
    }

    private static boolean isPelindrome(int n) {
        boolean prime = isPrime(n);
        int rev = 0, init = n;
        if (prime) {
            do {
                int d = n % 10;
                rev = rev * 10 + d;
                n = n / 10;
            } while (n > 0);
        }
        return rev == init;
    }

    private static boolean isPrime(int n) {
        int count = 1;
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0)
                count++;
        }
        return count == 2;
    }
}
