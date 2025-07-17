import java.util.*;
class Student
{
    int rno;
   String name;
   float per;
      Student(int rno1,String name1,float per1)
        {
           rno=rno1;
           name=name1;
           per=per1;
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