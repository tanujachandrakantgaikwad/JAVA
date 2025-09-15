// Write a java program to calculate area of Cylinder and Circle.(Use super keyword)
import java.util.*;
class Circle
 {
    double radius;

    Circle(double r) 
{
        radius = r;
    }

    double area()
 {
        return Math.PI * radius * radius;  // πr²
    }
}

class Cylinder extends Circle
 {
    double height;

    Cylinder(double r, double h) 
{
        super(r);  
        height = h;
    }

    double area() 
  {
         double baseArea = super.area();          
        double lateralArea = 2 * Math.PI * radius * height;
        return (2 * baseArea) + lateralArea;
    }
}
 class Main 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Circle c = new Circle(r);
        System.out.println("Area of Circle = " + c.area());

        Cylinder cyl = new Cylinder(r, h);
        System.out.println("Surface Area of Cylinder = " + cyl.area());
    }
}
