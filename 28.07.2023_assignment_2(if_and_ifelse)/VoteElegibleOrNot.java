import java.util.Scanner;

class VoteElegibleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter Your Age : ");
        int age = sc.nextInt();

        if(age<18)
           System.out.println("Your age is below to 18");
        if(age>=18)
           System.out.println("You are eligible for voting");
    }
}
