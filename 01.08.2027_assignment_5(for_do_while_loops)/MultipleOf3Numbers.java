import java.util.Scanner;

class MultipleOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intger value and print all values divisible by 3 :");
        int a = sc.nextInt();
            for (int i = 3; i <= a; i = i + 3) {
                System.out.println(i + " ");
            }
    }
}
