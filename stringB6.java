import java.util.*;
class Demo
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string");
    String s=sc.nextLine();
    String s1[]=s.split(" ");
     for(int i=0;i<s1.length;i++)
    {
       StringBuffer s3=new StringBuffer(s1[i]);
       s3.reverse();
       System.out.print(s3+" " );
    }
  }
}