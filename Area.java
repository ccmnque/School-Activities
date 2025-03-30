import java.util.Scanner;
import java.lang.Math.*;
class AreaCircumferenceCircle {

    public static void main(String[] args) {
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = pi * (radius * radius);
        double circumference = 2 * pi * radius;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);

    }
}