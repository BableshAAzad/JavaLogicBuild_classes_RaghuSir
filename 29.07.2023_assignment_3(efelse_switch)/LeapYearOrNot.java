import java.util.Scanner;

class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year and check leap or not : ");
        int a = sc.nextInt();

        if(a%4 == 0 )
            System.out.println(a + " is a leap year");
        else
           System.out.println(a + " is a not a leap year"); 
    }
}
