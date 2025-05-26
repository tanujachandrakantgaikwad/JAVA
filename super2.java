class A
{
   A()
   {
       System.out.println("I am a Deafult Construtor of A");
   }
 A(int a,int b)
   {
        int c=a*b;
      System.out.println("Multi="+c);
   }
}
class B extends A
{
   B()
   {
      System.out.println("I am a Deafult Construtor of B");
   }
B(int a,int b)
   {
       super(a,b);
        int c=a*b;
      System.out.println("Multi="+c);
   }

}
class MD
{
   public static void main(String args[])
    {
         B ob=new B(12,5);
    }
}