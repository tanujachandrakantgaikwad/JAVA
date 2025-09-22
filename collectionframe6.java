import java.util.*;
class Demo
{
   public static void main(String args[])
     {
       ArrayList a1=new ArrayList();
        a1.add("Tanuja");
        a1.add("67");
        a1.add("Sayali");
       a1.add("81");
      //System.out.println(a1);
  
     ListIterator it=a1.listIterator();
        while(it.hasNext())
         {
                  System.out.println(it.next());
          }
System.out.println("Reverse Order");


        while(it.hasPrevious())
         {
                  System.out.println(it.previous());
          }
     
     }
}