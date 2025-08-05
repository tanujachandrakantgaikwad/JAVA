import java.util.*;
class InValidEmailException extends Exception
{
   public String  toString()
    {
         return "InValidEmailException";
   }
 }
class Demo
{
  public static void main(String args[])
  {
    try
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter email");
   String s1=sc.next();
    int flag=0;
    for(int i=0;i<s1.length();i++)
   {
       if(s1.charAt(i)=='@')
       flag=1;
   }
    if(flag==0)
       throw new InValidEmailException();

      System.out.println("Valid Email="+s1);
}catch(Exception e)
  {
     System.out.println("Error="+e);
  }
  }
}