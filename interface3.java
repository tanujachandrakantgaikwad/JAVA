class Emp
{
   String ename;
  void getname(String name)
   {
     ename=name;
  }
   void disp()
   {
     System.out.println("Emp name="+ename);
    }
}
class sal extends Emp
{
   float basic,da,hra,gsal;
    void calc_sal(int b,int c,int d)//b =basic,c=da,d=hra
    {
         basic=b;
         da=basic*c/100;
         hra=basic*d/100;
        gsal=basic+da+hra;
  }
   void print_sal()
   {
           System.out.println("total salary="+gsal);
    }
}
interface Tax
{
      float ptax=200;
      float Itax=200;
      float calc_tax();
}
class Salary extends sal implements Tax
{
   public float calc_tax()
    {
       return ptax +(gsal*Itax/100);
   }
void disp1()
  {
     float tax=calc_tax();
     float nsal=gsal-tax;
    disp();
     print_sal();
    System.out.println("Tax="+tax);
   System.out.println("Net salary="+nsal);
 } 
}
 class MD
{
  public static void main(String args[])
  {
        Salary s=new Salary();
         s.getname("Tanuja");
          s.calc_sal(9100,50,10);
          s.disp1();
  }
}