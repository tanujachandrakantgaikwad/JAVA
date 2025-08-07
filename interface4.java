interface person
{
   interface student
 {
    void show();
  }
}
class Test implements person.student
{
    public void show()
   {
    System.out.println("I am show method");
   } 
public static void main(String agrs[])
  {
        person.student ps=new Test();
         ps.show();
  }
}
