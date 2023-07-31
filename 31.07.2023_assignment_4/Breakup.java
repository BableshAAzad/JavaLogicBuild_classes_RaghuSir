import java.util.Scanner;

class Breakup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        int a = sc.nextInt();

        String x = (a % 3 == 0 && a % 5 == 0) ? (a + " sanju wedds geedam")
                : (a % 5 == 0) ? (a + " geadam") : (a % 3 == 0) ? (a + " sanju") : (a + " Breakup");
        System.out.println(x);
    }
}
