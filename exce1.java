import java.io.*;
class Demo
{
   public static void main(String args[])throws Exception
  {
     DataInputStream din=new DataInputStream(System.in);
    System.out.println("Enter Name");
   String s1=din.readLine();
    System.out.println(" Name="+s1);
  }
}