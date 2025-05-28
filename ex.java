import java.util.*;
class SmallNumberException extends Exception
{
     public String toString()
       {
           return "Number is small";
     }
}
class GreaterNumberException extends Exception
{
     public String toString()
       {
           return "Number is Greater";
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
                if(n<=3)
                     throw new SmallNumberException();
               if(n>=10)
                    throw new GreaterNumberException();
               int f=1;
                    for(int i=1;i<=n;i++)
                           f=f*i;
                  System.out.println("Factorial Number ="+f);
           }
          catch(Exception e)
             {
                 System.out.println("Error="+e);
                }
     }
}