import java.util.*;
class Emp
{
   int eno;
   String ename;
   float sal;
    void accept(int eno1,String ename1,float sal1)
    {
       eno=eno1;
   ename=ename1;
   sal=sal1;

    }
 void disp()
   {
      System.out.println("emp no="+eno);
      System.out.println("emp name="+ename);
      System.out.println("emp sal="+sal);
   }
public static void main(String agrs[])
  {
     Emp ob=new Emp();
     Scanner sc=new Scanner(System.in);
         System.out.println("Enter emp no");
         int eno=sc.nextInt();
        System.out.println("Enter emp name");
         String ename=sc.next();
        System.out.println("Enter emp sal");
         float sal=sc.nextFloat();

     ob.accept(eno,ename,sal);
    ob.disp();
   }
}