
import java.util.*;
class Emp
{
   int eno;   
   String ename;
    float sal;
   void accept()
   {
   Scanner sc=new Scanner(System.in);
     System.out.println("Enter emp no:");
     eno=sc.nextInt();
     System.out.println("Enter emp name:");
     ename=sc.next();
     System.out.println("Enter emp sal:");
     sal=sc.nextFloat();
   }

    void disp()
    {
      System.out.println("Emp no="+eno);
      System.out.println("Emp name="+ename);
      System.out.println("Emp sal="+sal);
    }

    protected void finalized()
    {
 //     System.gc();
   Runtime r=Runtime.getRuntime();
              r.gc();
      System.out.println("Memory Free...");
    }

   public static void main(String args[])
   {
       Emp ob=new Emp();
         ob.accept();
         ob.disp();
   } 
}