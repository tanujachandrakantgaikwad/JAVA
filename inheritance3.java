class A
{
    A()
     {
           System.out.println("I am default constructor of A"); 
      }
public static void main(String agrs[])
{
   B ob=new B();
}

}
class B extends A
{
   B()
   {
      System.out.println("I am default constructor of B");
   }
  }

