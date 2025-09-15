// Define an Interface Shape with abstract method area(). Write a java program to //calculate an area of Circle and Sphere.(use final keyword) 
import java.util.*;
interface Shape 
{
    double area(); 
 }
class Circle implements Shape
 {
    final double PI = 3.14159;  // final constant
    double radius;

    Circle(double r)
 {
        radius = r;
    }

    public double area()
 {
        return PI * radius * radius;  // πr²
    }
}
class Sphere implements Shape 
{
    final double PI = 3.14159;  
    double radius;

    Sphere(double r)
 {
        radius = r;
    }

    public double area() {
        return 4 * PI * radius * radius;  // 4πr²
    }
}
 class Main
 {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        Sphere s = new Sphere(r);

        System.out.println("Area of Circle = " + c.area());
        System.out.println("Surface Area of Sphere = " + s.area());

    }
}
