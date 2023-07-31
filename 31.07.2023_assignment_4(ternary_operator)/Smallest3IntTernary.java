import java.util.Scanner;

class Smallest3IntTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integer values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String x = (a < b && a < c) ? (a + " is smallest")
                : (b < c) ? (b + " is smallest")
                        : (c + " is smallest");
        System.out.println(x);
    }
}
