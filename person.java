import java.util.*;
class person
{
    int pid;
    String pname;
    int age;
    String gender;
person()
  {
       pid=1;
       pname="om";
       age=20;
      gender="female";
  }
person(int pid,String pname,int age,String gender)
  {
        this.pid=pid;
        this.pname=pname;
        this.age=age;
        this.gender=gender;
   }
   void show()
  { 
     System.out.println("pid="+pid); 
    System.out.println("pname="+pname); 
    System.out.println("age="+age); 
    System.out.println("gender="+gender); 

  }
public static void main(String args[])
  {
     person ob[]=new person[3];
     for(int i=0;i<3;i++)
    {
     Scanner sc=new Scanner(System.in);
     System.out.printf("enter  id");
      int pid=sc.nextInt();   
    System.out.printf("enter  name");
     String pname=sc.next();
   System.out.printf("enter age");
      int age=sc.nextInt();   
   System.out.printf("enter Gender");
      String gender=sc.next();

             ob[i]=new person(pid,pname,age,gender);
  }
    for(int i=0;i<3;i++)
    { 
     ob[i].show();
   }
}
}