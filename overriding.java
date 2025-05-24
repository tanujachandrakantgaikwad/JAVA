 class A
{
     void add(int a,int b)
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
class C
{
       public static void main(String args[])
     {
           B ob=new B();
            ob.add(10,43);
             ob.add(39,21);
        }
}