import java.util.Scanner;

class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The integer : ");
        int n = sc.nextInt();
        boolean rs = isStrong(n);
        if (rs)
            System.out.println(n + " is a strong number");
        else
            System.out.println(n + " is not a strong number");
    }

    static boolean isStrong(int x) {
        int sum = 0, y = x;
        do {
            int d = x % 10;
            sum = sum + facto(d);
            x = x / 10;
        } while (x != 0);
        if (sum == y)
            return true;
        else
            return false;
    }

    static int facto(int z) {
        int f = 1;
        while (z > 1) {
            f = f * z;
            z--;
        }
        return f;
    }
}
