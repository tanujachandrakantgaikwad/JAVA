import java.io.*;
class Demo
{
  public static void main(String args[])
  {
     try
    {
        FileInputStream f1=new FileInputStream("pqr.txt");
       FileOutputStream f2=new FileOutputStream("mnt.txt");
       int k;
       while((k=f1.read())!=-1)
     {
          f2.write(k);
      }
  f1.close();
  f2.close();
 System.out.println("Data copy succ");
    }
  catch(Exception e)
    {
      System.out.println("Error="+e);
    }
  }

}