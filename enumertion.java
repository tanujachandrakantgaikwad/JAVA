import java.util.*;
class ContactList
{
  public static void main(String[] args)
  {
    Hashtable ht=new Hashtable();
    ht.put("rno","101");
    ht.put("name","om");
    ht.put("per","55.66");
    System.out.println(ht);
    System.out.println("All KEys=");

    Enumeration e1=ht.keys();
    while(e1.hasMoreElements())
    {
    	Object key=e1.nextElement();
    	System.out.print("Key="+key);
        System.out.println("values="+ht.get(key));
}
}
}