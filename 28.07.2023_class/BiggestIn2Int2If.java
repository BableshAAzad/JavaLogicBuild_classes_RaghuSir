import java.util.Scanner;

class BiggestIn2Int2If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integer values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b)
            System.out.println(a + " is a biggest value");
        if (b > a)
            System.out.println(b + " is a biggest value");
    }
}
