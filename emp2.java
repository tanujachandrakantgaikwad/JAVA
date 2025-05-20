import java.util.*; 
class Emp
{
   int eno;
  String ename;
  float sal;
  void accept()
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
   System.out.printf("\n emp no=%d",eno);
  System.out.printf("\n emp name=%s",ename);
 System.out.printf("\n emp sal=%f",sal);
}
public static void main(String args[])
{
   Emp ob=new Emp();
   ob.accept();
   ob.disp();
}
}
