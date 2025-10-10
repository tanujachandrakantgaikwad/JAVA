import java.io.*;
class demo
{
   public static void main(String args[])
   {
   try{
       FileInputStream f1=new FileInputStream("abc.txt");
       FileOutputStream f2=new FileOutputStream("xyz.txt");
          int k;
      while((k=f1.read())!=-1)
    {
        if(k>='A' && k<='Z')//if (!Character.isDigit((char) ch))
              f2.write(k);
         else if(k>='a' && k<='b')
              f2.write(k);
      }
   f1.close();
    f2.close();
  System.out.println("copy suc");
    }
  catch(Exception e)
{
   System.out.println("error="+e);
}
}
}