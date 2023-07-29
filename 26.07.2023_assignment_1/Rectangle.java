import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width : ");
        double width = sc.nextDouble();
        System.out.println("Enter the height : ");
        double length = sc.nextDouble();

        double perimeter = 2 * (width + length);
        double area = length * width;

        System.out.println("Rectangle perimeter is : " + perimeter);
        System.out.println("Rectangle area is : " + area);

    }
}
