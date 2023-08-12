import java.util.Scanner;

public class SumOfNaturalNumbersWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        int sum = 0, intT = n;
        while (n > 0) {
            sum = sum + n;
            n--;
        }
        System.out.println(intT + " natural numbers of sum is : " + sum);
    }
}
