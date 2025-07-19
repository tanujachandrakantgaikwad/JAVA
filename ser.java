import java.util.*;
class Demo
{
  void series()
  {
     int f=0,s=1,t,i;
     for(i=0;i<5;i++)
   {
      t=f+s;
       System.out.printf("  %d",t);
      f=s;
      s=t;
  }
 }
 public static void main(String args[]) 
{
    Demo ob=new Demo();
    ob.series();
}
}