class A
{
  int x=19;
}
class B extends A
{
    int x=29;
  void show()
    {
         int x=34;
       System.out.println("values="+x);
      System.out.println("values="+this.x);
      System.out.println("values="+super.x);
   }
}
class MD
{
    public static void main(String args[])
   {
       B ob=new B();
       ob.show();
   }
}





