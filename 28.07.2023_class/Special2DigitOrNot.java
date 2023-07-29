import java.util.Scanner;

class Special2DigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value : ");
        int a = sc.nextInt();

        int d1 = a/10;
        int d2 = a%10;
        int sum = d1+d2+d1*d2;
        if (a==sum)
            System.out.println(a + " is a special 2 digit number"); //59
        else 
            System.out.println(a + " is not a special 2 digit number");  
    }
}
