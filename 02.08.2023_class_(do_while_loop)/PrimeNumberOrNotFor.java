import java.util.Scanner;

class PrimeNumberOrNotFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                count = count+1;
        }
        if (count == 2)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }
}
