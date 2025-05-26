interface operation
{
   final float pi=3.14f;
   void area(float r,float h);
   void volume(float r,float h);
}
class cylinder implements operation
{
   public void area(float r,float h)
   { 
      float a=2*pi*r*h+2*pi*r*r;
      System.out.println("Area of cylinder="+a);
   }
  public void volume(float r,float h)
  {
     float v=pi*r*r*h;
      System.out.println("Volume of cylinder="+v);
   }
}
class MD
{
   public static void main(String args[])
  {
        cylinder ob=new cylinder();
         ob.area(2.2f,2.7f);
         ob.volume(2.3f,7.2f);
  }
}