interface I1
{
   public abstract void m1();
   public abstract void m2();
  public abstract void m3();
}
abstract class Test implements I1
{
    public void m1()
     {
       System.out.println("I am m1 Method");
     }
}
class Demo extends Test
{
   void run()
   {
      System.out.println("I am run Method");
   }
  public void m2()
     {
       System.out.println("I am m2 Method");
     }
  public void m3()
     {
       System.out.println("I am m3 Method");
     }
public static void main(String args[])
  {
     Demo d=new Demo();
       d.m1();
       d.m2();
       d.m3();
       d.run();

  }
}