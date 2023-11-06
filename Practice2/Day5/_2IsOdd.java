package Practice2.Day5;

import java.util.Scanner;

public class _2IsOdd {
    public int isOdd(int input1) {
        if (input1 % 2 != 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        int input1 = sc.nextInt();
        _2IsOdd e = new _2IsOdd();
        int i = e.isOdd(input1);
        System.out.println(i == 1 ? "Even" : "Odd");
        // System.out.println(13%2);
        // System.out.println(i);
        sc.close();
    }
}
