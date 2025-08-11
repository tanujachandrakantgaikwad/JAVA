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
                          String s[]=s1.split(" ");
                         for(int i=0;i<s.length;i++)
                      {
                        StringBuffer sbr=new StringBuffer(s[i]);
                             sbr.reverse();
                          System.out.printf("%s ",sbr);
                     }
                         System.out.println();
                  }
            }
       catch(Exception e)
        {
              System.out.println("Error"+e);
          }
   }
}