class A
{
   A()
 {
    System.out.println("I AM DEFAULT CONSTRUTOR OF A");
  }
}
class B extends A
{
  B(int a,int b)
 {
     System.out.println("Addition="+(a+b));
  }
}
class MD
{
   public static void main(String args[])
   {
     B ob=new B(23,76);
  }
}