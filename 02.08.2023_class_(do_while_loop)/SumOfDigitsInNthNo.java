import java.util.Scanner;

class SumOfDigitsInNthNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int n = sc.nextInt();
        int sum = 0;
        do {
            int d = n % 10;
            sum = sum + d;
            n = n / 10;
        } while (n != 0);
        System.out.println("Sum of all digits is : " + sum);
    }
}
