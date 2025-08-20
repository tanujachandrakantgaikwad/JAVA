import java.util.*;

class Tanuja 
{
    public static void main(String args[])
 {
        Vector v = new Vector();
        v.addElement(10);
        v.addElement(20);
        v.addElement("om");
        v.addElement(18);

        Iterator it = v.iterator(); 
        while(it.hasNext()) 
{ 
            Object obj = it.next();   
            System.out.println(obj); 
        }
    }
}
