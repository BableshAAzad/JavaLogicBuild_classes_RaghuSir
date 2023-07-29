import java.util.Scanner;
class Temparature {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the temperature in celcius : ");
    double celcius = sc.nextDouble();
    double fahrenheit = (celcius*9/5)+32;

    System.out.println("Temperature in Fahrenheit is : " + fahrenheit);
   } 
}
