import java.util.*;
class Student
{
    int rno;
   String name;
   float per;
      Student()
        {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter rno");
           rno=sc.nextInt();
           System.out.println("Enter name");
            name=sc.next();
            System.out.println("Enter per");
             per=sc.nextFloat();
       }
      void disp()
       {
            System.out.println("Roll no="+rno);
            System.out.println("Name="+name);
            System.out.println("per="+per);
      }
   public static void main(String args[])
  {
      Student ob=new Student();
      ob.disp();
   }
}