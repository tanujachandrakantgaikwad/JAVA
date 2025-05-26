class A
{
    void add(int a,int b)
  {
     int c=a+b;
     System.out.println("Addition 1="+c);
  }
}
class B extends A
{
      void add(int a,int b)
  {
     super.add(a,b);
     int c=a+b;
     System.out.println("Addition 2="+c);
  }     
}
class MD
{
    public static void main(String args[])
   {
       B ob=new B();
       ob.add(12,87);
   }
}





