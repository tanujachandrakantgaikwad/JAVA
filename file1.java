import java.io.*;
class FileDemo1
{
  public static void main(String args[])throws Exception
  {
      File f1=new File("abc.txt");
      if(f1.exists())
        {
                System.out.println("file found");
               System.out.println("File"+f1.getName());
               System.out.println("File path"+f1.getPath());
                System.out.println("File path"+f1.getAbsolutePath());

             if(f1.canRead())
                   System.out.println("file is readable");

              if(f1.canWrite())
                   System.out.println("file is writable");
   
                   System.out.println("file Length="+f1.length());

                if(f1.isFile())
                   System.out.println("It is file");
        }
    else
        {
           System.out.println("File Not Found");
       }
 }
}