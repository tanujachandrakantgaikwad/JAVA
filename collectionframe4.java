import java.util.*;
class Demo
{
   public static void main(String args[])
     {
         Hashtable ht=new Hashtable();
         ht.put("eno","1");
         ht.put("ename","tanuja");
         ht.put("salary","10000");
        System.out.println(ht);
       
      Hashtable ht1=new Hashtable();
         ht1.put("J","JAVA");
         ht1.put("H","HTML");
         ht1.put("P","PHP");
        System.out.println(ht1);

          ht.putAll(ht1);
         System.out.println(ht);

      if(ht.containsKey("eno"))
            System.out.println("found");

    if(ht.containsValue("tanuja"))
            System.out.println("found");

       System.out.println("value="+ht.get("ename"));
        System.out.println("size="+ht.size());

     }
}