import java.util.*;
class NagetiveAgeException extends Exception
{
     public String toString()
       {
           return "Age is less than 0 not allowed";
     }
}
class Ex
{
   public static void main(String args[])
     {
           try
          {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter Age");
               int a=sc.nextInt();
                if(a<0)
                     throw new NagetiveAgeException();
               System.out.println("Age="+a);
           }
          catch(Exception e)
             {
                 System.out.println("Error="+e);
               }
     }
}