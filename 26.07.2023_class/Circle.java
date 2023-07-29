import java.util.Scanner;
class Circle{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the radius of a circle : ");
        double radius = kb .nextDouble();
        double area = 3.143*radius*radius;
        double cir = 2*3.143*radius;

        System.out.println("Radius is : " + radius);
        System.out.println("Area is : " + area);
        System.out.println("Circumference is : " + cir);
    }
}