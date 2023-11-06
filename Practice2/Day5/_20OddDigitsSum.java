package Practice2.Day5;

import java.util.Scanner;

public class _20OddDigitsSum {
    /*
     * INPUT:9625
     * OUTPUT:14
     */
    public int OddDigitsSum(int input1) {
        // Read only region end
        int r, sum = 0;
        while (input1 > 0) {
            r = input1 % 10;
            if (r % 2 == 1) {
                sum = sum + r;
            }
            input1 = input1 / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        int input1 = sc.nextInt();
        _20OddDigitsSum e = new _20OddDigitsSum();
        int i = e.OddDigitsSum(input1);
        System.out.println(i);
        sc.close();
    }
}
