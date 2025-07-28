/* Define a class person(pid,pname,age,gender). Define Default and parameterised     
constructor. Overload the constructor. Accept the 5 person details and display it.(use this 
keyword).*/

import java.util.*;
class Person
{
   int pid,age;
   String pname,gender;
   Person()
   { 
     Scanner sc=new Scanner(System.in); 
     System.out.println("Enter pid:");
     pid=sc.nextInt();
     System.out.println("Enter pname:");
     pname=sc.next();
     System.out.println("Enter age:");
     age=sc.nextInt();
     System.out.println("Enter Gender:");
     gender=sc.next();
   }
   Person(int pid,String pname,int age,String gender)
   {
     this.pid=pid;
     this.pname=pname;
     this.age=age;
     this.gender=gender;
   }
   void disp()
   {
      System.out.println("Person id="+pid);
      System.out.println("Person name="+pname);
      System.out.println("Person age="+age);
      System.out.println("Person gender="+gender);
   }
   public static void main(String args[])
   {
     Person ob[]=new Person[5];
     for(int i=0;i<5;i++)
     {
       ob[i]=new Person();  
     }
     for(int i=0;i<5;i++)
    {
      ob[i].disp();
    }
 }
}