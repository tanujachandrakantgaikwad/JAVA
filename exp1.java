import java.util.*;
class Invalidpancard extends Exception
{
    public String toString()
    {
      return "pan card number is invalid";
   }
}
class panDemo
{
    public static void main(String args[])
      {
     try
{
          Scanner sc=new Scanner(System.in);
          System.out.println("enter pan number");
          String s1=sc.next();
          if(s1.length()!=10)
             throw new Invalidpancard();
         for(int i=0;i<5;i++)
           {
              if(!(s1.charAt(i)>='A'&&s1.charAt(i)<='Z'))
                  throw new Invalidpancard();
           }
        for(int i=5;i<9;i++)
         {
             if(!(s1.charAt(i)>='0'&&s1.charAt(i)<='9'))
                  throw new Invalidpancard();
           }
        if(!(s1.charAt(9)>='A'&&s1.charAt(9)<='Z'))
                  throw new Invalidpancard();

     System.out.println("pan card number="+s1);
      }catch(Exception e)
    {
        System.out.println("Error"+e);
        } 
 }
}
