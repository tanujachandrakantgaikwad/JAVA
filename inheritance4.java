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
   Student ob=new Student();
    ob.acceptc();
    ob.accepts();
    ob.disp();

}
}
