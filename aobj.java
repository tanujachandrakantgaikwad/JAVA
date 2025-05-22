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
    System.out.println("\nemp no="+eno);
    System.out.println("\nemp name="+ename);
   System.out.println("\nemp sal="+sal);
  }
public static void main(String args[])
  {
    Emp ob[]=new Emp[5];
          for(int i=0;i<5;i++)
     {
            ob[i]=new Emp();//constructor calling
     }   
           for(int i=0;i<5;i++)
      { 
           ob[i].disp();
      }
}
}