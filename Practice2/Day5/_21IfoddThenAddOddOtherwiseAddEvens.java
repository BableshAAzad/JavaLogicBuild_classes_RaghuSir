package Practice2.Day5;

import java.util.Scanner;

public class _21IfoddThenAddOddOtherwiseAddEvens {
    public static int EvenOddDigitsSum(int input1, String input2) {
        // Read only region end
        // Write code here...
        if (input2.equals("odd")) {
            int sum = 0;
            while (input1 > 0) {
                int r = input1 % 10;
                if (r % 2 == 1) {
                    sum += r;
                }
                input1 /= 10;

            }
            return sum;
        } else {
            int sum = 0;
            while (input1 > 0) {
                int r = input1 % 10;
                if (r % 2 == 0) {
                    sum += r;
                }
                input1 /= 10;

            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number : ");
        int n = sc.nextInt();
        System.out.println("Enter to (even or odd)");
        String str = sc.next();
        int sum = EvenOddDigitsSum(n, str);
        System.out.println(sum);
        sc.close();
    }
}
