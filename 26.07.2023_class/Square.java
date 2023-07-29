import java.util.Scanner;
class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of a Square : ");
        float side = scan.nextFloat();
        double area = side*side;
        double perm = 4*side;

        System.out.println("Square side is : " + side);
        System.out.println("Area of Square is : " + area);
        System.out.println("Perimeter of Square is : " + perm);
    }
}
