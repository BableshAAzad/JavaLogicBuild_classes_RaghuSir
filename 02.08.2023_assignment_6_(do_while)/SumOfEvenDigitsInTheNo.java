import java.util.Scanner;

class SumOfEvenDigitsInTheNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int n = sc.nextInt();
        int sum = 0;
        do {
            int d = n % 10;
            if (d % 2 == 0)
                sum = sum + d;
            n = n / 10;
        } while (n != 0);
        System.out.println(sum);
    }
}
