package Integerrr;
import java.util.Scanner;

class PassFailUsingAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all 4th subjects marks : ");
        int phy = sc.nextInt();
        int che = sc.nextInt();
        int math = sc.nextInt();
        int bio = sc.nextInt();

        if(phy>=35 && che>=35 && math>=35 && bio>=35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
