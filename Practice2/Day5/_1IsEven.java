package Practice2.Day5;

import java.util.Scanner;

public class _1IsEven {
    public int isEven(int input1) {
        // Read only region end
        // Write code here...
        if (input1 % 2 == 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        int input1 = sc.nextInt();
        _1IsEven e = new _1IsEven();
        int i = e.isEven(input1);
        System.out.println(i == 2 ? "Even" : "Odd");
        sc.close();
    }
}
