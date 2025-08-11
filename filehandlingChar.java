// Write a java program to accept the data from a user and write it into the file. 
import java.io.*;
class Demo
{
  public static void main(String args[])
  {
    try
    {
      DataInputStream din=new DataInputStream(System.in);
       FileWriter f1=new FileWriter("cdj.txt");
      System.out.println("Enter 3 Lines:");
        for(int i=1;i<=3;i++)
        {
          String s=din.readLine();
          f1.write(s+"\n");  
        }
   
         f1.close();
      System.out.println("File write succ..");
    }
    catch(Exception e)
    {
     System.out.println("Error"+e);
   }
 }
}