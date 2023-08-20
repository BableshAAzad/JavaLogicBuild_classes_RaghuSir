import java.util.Scanner;

class ZeroOrNonZeroTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        int a = sc.nextInt();

        String x = (a==0) ? (a + " is equal to zero") : (a + " is not equal to zero");
        System.out.println(x);
    }
}
