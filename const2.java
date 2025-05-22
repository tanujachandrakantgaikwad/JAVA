import java.util.*; 
class Emp
{
   int eno;
  String ename;
  float sal;
Emp(int eno,String ename, float sal)
{
       this.eno=eno;
      this.ename=ename;
       this.sal=sal;
}
void disp()
{
    System.out.println("emp no="+eno);
    System.out.println("emp name="+ename);
   System.out.println("emp sal="+sal);
}
public static void main(String args[])
{
    Emp ob=new Emp(101,"om",2002);
    ob.disp();
}
}