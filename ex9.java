import java.util.*;
class invalidNumberException extends Exception
{
     public String toString()
       {
           return "Number is Zero";
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
                             s=(s*10)+d;
                             n=n/10;
               }
              if(s==n1)
                 System.out.println("Number is palindrome");
              else
                  System.out.println("Number is not palindrome");
           }
          catch(invalidNumberException e)
             {
                 System.out.println("Error="+e);
                }
        catch(Exception e1)
             {
                 System.out.println("Inavlid number");
               }

     }
}