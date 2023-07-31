import java.util.Scanner;

class Biggest4IntTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 integer values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        String x = (a > b && a > c && a > d) ? (a + " is greater")
                : (b > c && b > d) ? (b + " is greater")
                        : (c > d) ? (c + " is greater")
                                : (d + " is greater");
        System.out.println(x);
    }
}