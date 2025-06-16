import java.util.*;
class Demo
{
  public static void main(String args[])
  {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String");
       String s1=sc.next();
      System.out.println("alternate char");
       for(int i=0;i<s1.length();i=i+2)
                  System.out.printf("%c",s1.charAt(i));
         
  }
}