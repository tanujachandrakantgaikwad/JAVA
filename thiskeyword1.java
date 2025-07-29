//this keyword
class Test
{
   Test()
   {
      System.out.println("I am no argument constructor");
  }
 Test(int a)
  {
     this();
     System.out.println("I am  Parameterized constructor");
  }
public static void main(String args[])
{ 
   Test t=new Test(10);
 }
}