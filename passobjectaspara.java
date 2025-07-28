//Write a java program to accept details of  ‘n’  books. And Display the quantity of given book. 
import java.util.*;
class Book
{
   int bno,qty;
   String bname;
   void accept()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter bno:");
      bno=sc.nextInt();
      System.out.println("Enter bname:");
      bname=sc.next();
      System.out.println("Enter qty:");
      qty=sc.nextInt();
   }
   static void disp(Book ob[],String bname,int n)
   {
     int i;
      for(i=0;i<n;i++)
      {
        if(ob[i].bname.equals(bname))
        {    
          System.out.println("Qualtity="+ob[i].qty);
             break;
        }
      }
      if(i==n)
         System.out.println("Record not found...");
   }
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Limit:");
      int n=sc.nextInt();
      Book ob[]=new Book[n];
      for(int i=0;i<n;i++)
      {
        ob[i]=new Book();      
        ob[i].accept();
      }   
     System.out.println("Enter Book name to search Qty:");
     String bname=sc.next();
    disp(ob,bname,n);}
}