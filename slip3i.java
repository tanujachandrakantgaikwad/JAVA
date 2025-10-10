abstract class Shape 
{
    double radius, height;
    Shape(double r, double h) 
 {  
        radius = r;
        height = h;
    }
    abstract double area();       
    abstract double volume();     
}
class Cylinder extends Shape
 {
    Cylinder(double r, double h) 
  {
        super(r, h); 
    }
    double area() 
{
        return 2 * 3.14 * radius * (radius + height); // Surface area
    }
    double volume()
 {
        return 3.14 * radius * radius * height;       // Volume
    }
}


class Cone extends Shape
 {
    Cone(double r, double h)
 {
        super(r, h); 
    }

    double area() 
{
        double slant = Math.sqrt(radius * radius + height * height);
        return 3.14 * radius * (radius + slant);      // Surface area
    }
    double volume() 
{
        return (1.0 / 3) * 3.14 * radius * radius * height; // Volume
    }
}
public class Demo 
{
    public static void main(String args[]) 
{
        double r = 3;  
        double h = 5;  

        Cylinder cylinder = new Cylinder(r, h);

        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        Cone cone = new Cone(r, h);
        System.out.println("Cone Area: " + cone.area());
        System.out.println("Cone Volume: " + cone.volume());
    }
}
