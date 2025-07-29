//this keyword
class Test
{
  void m1()
 {
    System.out.println("m1 method");
 }
void m2()
 {
   m1(this);
 }
public static void main(String args[])
{ 
   Test t=new Test();
     t.m2();
 }
}