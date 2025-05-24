 class A
{
     final void add(int a,int b)
     {
          int c=a+b;
          System.out.println("addition of A class="+c);
      }
  }
class B extends A
{
void add(int a,int b)
     {
          int c=a+b;
          System.out.println("addition of B class="+c);
      }
}
