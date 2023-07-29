import java.util.Scanner;

class ZeroOrNonZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value : ");
        int a = sc.nextInt();

        if (a == 0)
            System.out.println(a + " is a zero number");
        if (a > 0)
            System.out.println(a + " is not a zero number");
        if (a < 0)
            System.out.println(a + " is small to a zero number");
    }
}
