//4)compareTo():
import java.util.*;
class Demo
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String1:");
       String s1=sc.next();
       System.out.println("Enter String2:");
       String s2=sc.next();

        int k=s1.compareTo(s2);

         if(k==0)
            System.out.println(" String are same:");
        if(k>0)
            System.out.println(" Frist String is Greater:");
        if(k<0)
            System.out.println(" Second String is Greater:");
      
    }
}