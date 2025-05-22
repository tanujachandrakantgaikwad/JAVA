import java.util.*; 
class Emp
{
   int eno;
  String ename;
  float sal;
Emp()
{
     Scanner sc=new Scanner(System.in);
     System.out.printf("enter emp no");
      eno=sc.nextInt();   
    System.out.printf("enter emp name");
      ename=sc.next();  
   System.out.printf("enter emp sal");
      sal=sc.nextFloat();   
}
void disp()
{
    System.out.println("emp no="+eno);
    System.out.println("emp name="+ename);
   System.out.println("emp sal="+sal);
}
public static void main(String args[])
{
    Emp ob=new Emp();
    ob.disp();
}
}