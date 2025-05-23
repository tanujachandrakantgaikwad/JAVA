import java.util.*;
class Product
{
 int pid;
  String pname;
  int price;
 void accept()
{
       Scanner sc=new Scanner(System.in);
       System.out.printf("enter  pid");
        pid=sc.nextInt();  
      System.out.printf("enter  pname");
        pname=sc.next();
      System.out.printf("enter  price");
        price=sc.nextInt();
 }
void disp()
{
    System.out.println("\n pid="+pid);
    System.out.println("pname="+pname);
    System.out.println("price="+price);

 }
public static void main(String args[])
{
       Product ob[]=new Product[3];
       for(int i=0;i<3;i++)
   {
          ob[i]=new Product();
         ob[i].accept();
   }
 int s=0;
  for(int i=0;i<3;i++)
   {
        s=s+ob[i].price;
        ob[i].disp();
   }
  System.out.println("total="+s);

}
}