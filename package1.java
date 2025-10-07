
import java.util.*;
abstract class Shape
{
	Scanner sc=new Scanner(System.in);
	abstract void area();
}
class Rectangle extends Shape
{
   void area()
   {
	  System.out.println("Enter Length & breadth:");
	  float l=sc.nextFloat();
	  float b=sc.nextFloat();
	  float a=l*b;
	  System.out.println("Area of Rectangle="+a);
   }
}
class Triangle extends Shape
{
  void area()
  {
	  System.out.println("Enter base & height:");
	  float b=sc.nextFloat();
	  float h=sc.nextFloat();
	  float a=0.5f*b*h;
	  System.out.println("Area of Triangle="+a);
  }
}
 class AbDemo1
{
  public static void main(String[] args)
  {
    Rectangle ob=new Rectangle();
    Triangle ob1=new Triangle();
 ob.area();
 ob1.area();
}
}