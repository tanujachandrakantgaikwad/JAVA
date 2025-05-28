import java.util.*;
class invalidNumberException extends Exception
{
     public String toString()
       {
           return "Number is invalid";
     }
}
class Ex
{
   public static void main(String args[])
     {
           try
          {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter Number");
               int n=sc.nextInt();
                if(n==0)
                     throw new invalidNumberException();
               int s=0;
              int n1=n;
               while(n>0)
                 {
                      int d=n%10;
                             s=s+d*d*d;
                             n=n/10;
               }
              if(s==n1)
                 System.out.println("Number is Armstrong");
              else
                  System.out.println("Number is not Armstrong");
           }
          catch(Exception e)
             {
                 System.out.println("Error="+e);
               }
     }
}