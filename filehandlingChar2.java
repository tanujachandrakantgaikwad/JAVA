import java.io.*;
class Demo
{
  public static void main(String args[])
   {
        try
           {
               FileReader f1=new FileReader("abc.txt");
                BufferedReader br=new BufferedReader(f1);
                 String s1="";
                 while((s1=br.readLine())!=null)
                   {
                        StringBuffer sbr=new StringBuffer(s1);
                             sbr.reverse();
                          System.out.printf("%s \n ",sbr);
                  }
            }
       catch(Exception e)
        {
              System.out.println("Error"+e);
          }
   }
}