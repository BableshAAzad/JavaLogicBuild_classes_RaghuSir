import java.util.Scanner;

class NthToFirstNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int n = sc.nextInt();
        for (; n>0; n--) {
            System.out.print(n + " ");
        }
    }
}
