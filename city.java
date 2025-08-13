import java.util.*;
class city
{
   public static void main(String args[])
 {
      Scanner sc=new Scanner(System.in);
       System.out.println("enter limit");
        int n=sc.nextInt();
      System.out.println("enter n city name");
       String s[]=new String[n];
       for(int i=0;i<s.length;i++)
          {
               s[i]=sc.next();
           }
       for(int i=0;i<n;i++)
            {
                 for(int j=i+1;j<n;j++)
                  {
                    if (s[i].compareTo(s[j]) > 0)
                       {
                            String t=s[i];
                             s[i]=s[j];
                             s[j]=t;
                         }
                 }
              }
              System.out.println( "city name's=");
          for(int i=0;i<n;i++)
           {
                System.out.println(s[i]);
           }
   }
}