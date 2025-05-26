interface A
{
    void add(int a,int b);
    void square(int n);
}
interface B
 {
     void cube(int n);
 }
class C implements A,B
{
   public void add(int a,int b)
  {
      int c=a+b;
      System.out.println("Addition="+c);
  }
  public void square(int n)
   {
      int a=n*n;
      System.out.println("Square="+a);
   }
  public void cube(int n)
   {
      int a=n*n*n;
      System.out.println("cube="+a);
   }
}
class MD
{
  public static void main(String args[])
    {
        C ob=new C();
        ob.add(21,54);
        ob.square(2);
        ob.cube(4);   
   }
}