import java.util.Scanner;

class SumAllDivisibleByN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intger value and print sum of all divisible values :");
        int a = sc.nextInt();
        int sumDivValues = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
                sumDivValues = sumDivValues + i;
            }
        }
        System.out.println("Sum of all divisible values is : " + sumDivValues);
    }
}
