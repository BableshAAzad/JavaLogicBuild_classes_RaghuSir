import java.util.Scanner;
 class OddEventWUMO{
    // numebere is even or odd without using modulus operator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        int a = sc.nextInt();

        if(a/2 * 2 == a)
           System.out.println(a + " is a even number");
        else
           System.out.println(a + " is a odd number");

    }
 }