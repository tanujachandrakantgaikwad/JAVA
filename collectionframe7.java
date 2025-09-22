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
  
    Iterator it=a1.iterator();
        while(it.hasNext())
         {
                 
          try{
           
                 Object ob=it.next();
                 int num=Integer.parseInt(ob.toString());
                  System.out.println(num);
          }catch(Exception e)
           {  }
      }
}
}