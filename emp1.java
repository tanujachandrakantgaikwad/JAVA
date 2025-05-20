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
   System.out.printf("\n emp no=%d",eno);
  System.out.printf("\n emp name=%s",ename);
 System.out.printf("\nemp sal=%f",sal);
}
public static void main(String args[])
{
   Emp ob=new Emp();
   ob.accept(101,"om",2000);
   ob.disp();
}
}
    