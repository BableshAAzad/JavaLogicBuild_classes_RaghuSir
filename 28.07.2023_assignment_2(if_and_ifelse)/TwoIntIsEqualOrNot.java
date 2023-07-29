import java.util.Scanner;

class TwoIntIsEqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two integer values :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b == a)
            System.out.println(a + " and " + b + " both are equal");
        if (a != b)
            System.out.println(a + " and " + b + " both are not equal");
    }
}
