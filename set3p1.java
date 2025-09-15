// Create abstract class Shape with abstract method area().Write a Java program to 
//calculate are of Rectangle and Triangle.(Inherit Shape class in classes Rectangle and 
//Triangle ) 

abstract class Shape 
{
      abstract void area();
}
class Rectangle extends Shape 
{
    int length, breadth;

    Rectangle(int l, int b) 
 {
        length = l;
        breadth = b;
    }
   void area() 
{
        int result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
}
class Triangle extends Shape
 {
    int base, height;

    Triangle(int b, int h) 
{
        base = b;
        height = h;
    }
   void area()
 {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }
}


 class Demo
 {
    public static void main(String[] args) 
{
        Rectangle r = new Rectangle(10, 5);
        r.area();

        Triangle t = new Triangle(10, 6);
        t.area();
    }
}
