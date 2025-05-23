import java.util.*;
class College
{
   int cno;
   String cname;
   String Addr;
  void acceptc()
   {
       Scanner sc=new Scanner(System.in);
      System.out.println("College cno");
       cno=sc.nextInt();
     System.out.println("College cname");
       cname=sc.next();
     System.out.println("College address");
       Addr=sc.next();
  }
}
class Teacher extends College
{
   String tname,quali;
   float sal;
  void acceptt()
   {
      Scanner sc=new Scanner(System.in);
         System.out.println("teacher tname");
          tname=sc.next();
         System.out.println("quali");
          quali=sc.next();
       System.out.println("enter sal");
          sal=sc.nextFloat();
   }
    void disp()
 {
        System.out.println("College cno="+cno);
         System.out.println("College name="+cname);
         System.out.println("College address="+Addr);
        System.out.println("Teacher name="+tname);
        System.out.println("Teacher quail="+quali);
       System.out.println("Teacher sal="+sal);
  }
}
class Student  extends College
{
     int rno;
    String sname;
    float per;
    void accepts()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Student rno");
       rno=sc.nextInt();
       System.out.println("Student name");
       sname=sc.next();
      System.out.println("Student per");
       per=sc.nextFloat();
      }
   void disp()
   {
        System.out.println("College cno="+cno);
         System.out.println("College name="+cname);
         System.out.println("College address="+Addr);
         System.out.println("Student rno="+rno);
         System.out.println("Student name="+sname);
         System.out.println("Student per="+per);
  }

public static void main(String args[])
{
     Teacher ob=new Teacher();
       ob.acceptc();
       ob.acceptt();
        ob.disp();
   Student ob1=new Student();
    ob1.acceptc();
    ob1.accepts();
    ob1.disp();

}
}
