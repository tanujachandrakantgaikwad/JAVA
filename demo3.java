import java.util.*;
class tanuja
{
 public static void main(String args[])
  {
    int i,n; 
 String str; 
 Integer obj; 
 Collection c=new ArrayList (); 
 
 n=args.length; 
 for(i=0;i<n;i++) 
 { 
  c.add(args[i]); 
 }
    Iterator it=c.iterator (); 
 while(it.hasNext()) 
 { 
  str = (String)it.next(); 
  System.out.println (str); 
 }
  }
}