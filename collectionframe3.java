import java.util.*;
class Demo
{
  public static void main(String args[])
  {
      ArrayList a1=new ArrayList();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Limit");
       int n=sc.nextInt();
     System.out.println("Enter n number");
      for(int i=0;i<n;i++)
       {
          int num=sc.nextInt();
           a1.add(num);
        }
     System.out.println(a1);
     Collections.sort(a1);
      System.out.println("After sort="+a1);
    a1.clear();
   System.out.println(a1);

   }
}