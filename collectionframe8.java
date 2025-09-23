import java.util.*;
class Demo
{
   public static void main(String arggg[])
   {
      LinkedList a1=new LinkedList();
      a1.add("red");
      a1.add("blue");
      a1.add("yellow");
      a1.add("orange");
     System.out.println("Disp Using Iterator:");
      Iterator it=a1.iterator();
      while(it.hasNext())
       {
          System.out.println(it.next());
       }
     ListIterator it1=a1.listIterator();
      while(it1.hasNext())
       {
           it1.next();
       }
     System.out.println("Disp Using ListIterator:");
       while(it1.hasPrevious())
       {
         System.out.println(it1.previous());
       }
  
       LinkedList a2=new LinkedList();
       a2.add("pink");
       a2.add("green");
 
       a1.add(2,a2);
System.out.println(a1);
}
}