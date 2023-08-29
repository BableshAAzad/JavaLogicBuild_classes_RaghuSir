package Integerrr;
import java.util.Scanner;

class IntInMonthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number : ");
        int a = sc.nextInt();
        switch(a){
             case 1:
             System.out.println("January");
             return;
             case 2:
             System.out.println("February");
             return;
             case 3:
             System.out.println("March");
             return;
             case 4:
             System.out.println("April");
             return;
             case 5:
             System.out.println("May");
             return;
             case 6:
             System.out.println("June");
             return;
             case 7:
             System.out.println("July");
             return;
             case 8:
             System.out.println("August");
             return;
             case 9:
             System.out.println("September");
             return;
             case 10:
             System.out.println("October");
             return;
             case 11:
             System.out.println("November");
             return;
             case 12:
             System.out.println("December");
             return;
             default:    
             System.out.println("Please enter only 1 to 12 month numbers");
        }
    }
}
