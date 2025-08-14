import java.io.*;
class FileDemo1
{
  public static void main(String args[])throws Exception
  {
         DataInputStream din=new DataInputStream(System.in);
          System.out.println("enter file name");
            String s=din.readLine();
      File f1=new File(s);
      if(f1.exists())
        {
               System.out.println("File Name="+f1.getName());
              System.out.println("File Length="+f1.length());

        }
    else
        {
           System.out.println("File Not Found");
       }
 }
}