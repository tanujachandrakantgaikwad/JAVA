import java.io.*;
class FileDemo1
{
  public static void main(String args[])
  {
      File f1=new File("abc.txt");
      if(f1.exists())
        {
               System.out.println("File Found");
        }
    else
        {
           System.out.println("File Not Found");
       }
 }
}