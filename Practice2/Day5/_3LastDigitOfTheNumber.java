package Practice2.Day5;

import java.util.Scanner;

public class _3LastDigitOfTheNumber {
    public int lastDigitOf(int input1) {
        // Read only region end
        if (input1 < 0)
            input1 = (-1) * input1;
        return input1 % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        int input1 = sc.nextInt();
        _3LastDigitOfTheNumber e = new _3LastDigitOfTheNumber();
        int i = e.lastDigitOf(input1);
        System.out.println(i);
        sc.close();
    }
}
