interface outer
{
     void outer_method();
   interface nested
 {
    void nested_method();
  }
}
class Test implements outer,outer.nested
{
    public void outer_method()
   {
    System.out.println("I am outer interface method");
   } 
public void nested_method()
   {
    System.out.println("I am nested interface method");
   } 
public static void main(String agrs[])
  {
        Test t=new Test();
         t.outer_method() ;
         t.nested_method();  
}
}
