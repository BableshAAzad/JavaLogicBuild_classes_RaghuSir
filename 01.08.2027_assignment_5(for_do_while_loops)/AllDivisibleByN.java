import java.util.Scanner;

class AllDivisibleByN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intger value and print all divisible values :");
        int a = sc.nextInt();
        
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                System.out.println(i);
        }
    }
}
