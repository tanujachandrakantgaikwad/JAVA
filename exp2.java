import java.util.*;
class Demo
{
    public static void main(String args[])
      {
         int i;
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter limit");
    int n=sc.nextInt();
     String s1[]=new String[n];
      System.out.println("Enter n names");
     for(i=0;i<n;i++)
    {
      s1[i]=sc.next();
   }
 System.out.println("Enter name to search");
 String name=sc.next();
  for(i=0;i<n;i++)
  {
     if(s1[i].equals(name))
   {
      System.out.println("name Found index"+i);
      break;
  }
  }
   if(n==i)
     System.out.println("not found");
    }
}