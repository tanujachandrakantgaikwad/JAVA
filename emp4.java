import java.util.*;
class Emp
{
  int eno;
  String ename;
  float sal;
   Emp()
   {
      eno=101;
      ename="om";
       sal=44444;
    }
Emp(int eno,String ename,float sal)
  {
    this.eno=eno;
    this.ename=ename;
    this.sal=sal; 
  }
  void disp()
  {
    System.out.printf("\n Emp no=%d",eno);
    System.out.printf("\n Emp name=%s",ename);
    System.out.printf("\n Emp sal=%f",sal);
  }
  public static void main(String args[])
  {  
      Emp ob[]=new Emp[5];   
    for(int i=0;i<5;i++)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter emp no:");
    int eno=sc.nextInt();
    System.out.println("Enter emp name:");
    String ename=sc.next();
    System.out.println("Enter emp sal:");
    float sal=sc.nextFloat();
  
        ob[i]=new Emp(eno,ename,sal); 
    }
    for(int i=0;i<5;i++)
     {
       ob[i].disp();
     }
  }
}