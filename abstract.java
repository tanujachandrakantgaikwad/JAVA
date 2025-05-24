abstract class A
{
   abstract void add(int a,int b);
   abstract void cube(int n);
   void square(int n)
  {
       System.out.println("Square="+n*n);
   }
}
class B extends A
{
   void add(int a,int b)
       {
          System.out.println("Addition="+a+b);
        }
void cube(int n)
      {
            System.out.println("Square="+n*n*n);
          }
}
class Demo
{
public static void main(String args[])
    {
          B ob=new B();
          ob.add(12,89);
          ob.cube(23);
          ob.square(12);
     }
}