import java.util.Scanner;

public class Diameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        int radius = input.nextInt();
        double pie = 3.14159;
        double diameter = 2 * radius;
        double circumference = 2 * pie * radius;
        double area = pie * (radius * radius);
        System.out.println("Diameter is:" + diameter);
        System.out.println("Circumference is:" + circumference);
        System.out.println("Area is: " + area);
    }
}
