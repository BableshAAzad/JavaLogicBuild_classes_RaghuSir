import java.util.Scanner;

class NegvOrPosvInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value : ");
        int a = sc.nextInt();
        
        if (a < 0)
            System.out.println(a + " is a negative value"); 
        else 
            System.out.println(a + " is a positive value");  
    }
}
