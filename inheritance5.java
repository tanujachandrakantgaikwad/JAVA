import java.util.*;
class Continent
{
    String conname;
      Scanner sc=new Scanner(System.in);
     void acceptcon()
      {
        System.out.println("enter Continent name");
         conname=sc.next();
      }
}
class Country extends Continent
{
    String cname;
    void acceptc()
     {
        System.out.println("enter coutry name");
         cname=sc.next();
    }
}
class State extends Country
{
    String sname,place;
     void accepts()
   {
        System.out.println("enter state name");
        sname=sc.next();
         System.out.println("enter state place");
        place=sc.next();
   } 
   void disp()
    { 
       System.out.println("continent name="+conname);
      System.out.println("country name="+cname);
      System.out.println("state name="+sname);
      System.out.println("place="+place);
       
    }
public static void main(String agrs[])
  {
        State ob=new State();
        ob.acceptcon();
        ob.acceptc();
       ob.accepts();
        ob.disp();
  }
}