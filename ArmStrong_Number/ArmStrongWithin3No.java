package ArmStrong_Number;
import java.util.Scanner;

class ArmStrongWithin3No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The integer : ");
        int n = sc.nextInt();
        boolean rs = isArmStrong(n);
        if (rs)
            System.out.println(n + " is a Armstrong number");
        else
            System.out.println(n + " is not a Armstrong number");
    }
    static boolean isArmStrong(int x) {
        int sum = 0, nValue = x;
        do {
            int d = x % 10;
            sum = sum + d*d*d;
            x = x / 10;
        } while (x != 0);
        return sum == nValue;
    }
}
